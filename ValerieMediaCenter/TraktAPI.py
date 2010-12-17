
import urllib
import urllib2

# disgracefully stolen from xbmc subtitles
try:
  # Python 2.6 +
  from hashlib import sha as sha
except ImportError:
  # Python 2.5 and earlier
  import sha

class TraktAPI():
	URL = "http://api.trakt.tv"

	STATUS_IDLE     = "idle"
	STATUS_WATCHING = "watching"
	STATUS_WATCHED  = "watched"

	TYPE_TVSHOW = "TVShow"
	TYPE_MOVIE  = "Movie"

	APIVERSION = "0.0.7" #ACtually this is not the version of the plugin, but the API version to use

	mMediaCenterShortName = "pytrakt"
	mMediaCenterVersion   = "1.0"
	mMediaCenterBuildDate = "'1970-01-01"

	mStatus     = STATUS_IDLE
	mMovieName  = ""
	mYear       = 0
	mImdbId     = ""
	mTheTvDbId  = ""
	mSeason     = 0
	mEpisode    = 0
	mType       = TYPE_TVSHOW

	mUsername   = "noname"
	mPassword   = "nopass"
	
	mProgress   = -1
	
	def __init__(self, mcshortname=None, mcversion=None, mcbuidldate=None):
		if mcshortname is not None:
			self.mMediaCenterShortName = mcshortname
		if mcversion is not None:
			self.mMediaCenterVersion = mcversion
		if mcbuidldate is not None:
			self.mMediaCenterBuildDate = mcbuidldate

	def setStatus(self, status):
		self.mStatus = status

	def setName(self, name):
		self.mMovieName = name

	def setSeasonAndEpisode(self, season, episode):
		self.mSeason = season
		self.mEpisode = episode

	def setYear(self, year):
		self.mYear = year

	def setType(self, type):
		self.mType = type
		self.mProgress = -1

	def setUsernameAndPassword(self, user, passwd):
		self.mUsername = user
		self.mPassword = sha.new(passwd).hexdigest()
		#self.mPassword = passwd

	def setImdbId(self, imdbid):
		self.mImdbId = imdbid
		# To force using the id we have to make sure that title maching will never work
		self.mMovieName = "abcdefgh"

	def setTheTvDbId(self, thetvdbid):
		self.mTheTvDbId = thetvdbid
		# To force using the id we have to make sure that title maching will never work
		self.mMovieName = "abcdefgh"

	def setProgress(self, progress):
		self.mProgress = progress

	def send(self):
		dict = None
		if self.mType == self.TYPE_MOVIE:
			dict = {
				"type":     self.TYPE_MOVIE,
				"title":    self.mMovieName, 
				"year":     self.mYear, 
				"imdbid":   self.mImdbId
			}
		elif self.mType == self.TYPE_TVSHOW:
			dict = {
				"type":     self.TYPE_TVSHOW,
				"title":    self.mMovieName, 
				"year":     self.mYear, 
				"tvdbid":   self.mTheTvDbId,
				"season":   self.mSeason,
				"episode":  self.mEpisode
			}
		if dict is not None:
			
			if self.mProgress > 0 and self.mProgress <= 100:
				dict["progress"] = self.mProgress
			
			dict["status"]   = self.mStatus
			dict["username"] = self.mUsername 
			dict["password"] = self.mPassword
			dict["media_center"]         = self.mMediaCenterShortName
			dict["media_center_version"] = self.mMediaCenterVersion
			dict["media_center_date"]    = self.mMediaCenterBuildDate
			dict["plugin_version"] = self.APIVERSION
			
			print "TOSEND", dict
			toSend = urllib.urlencode(dict)
			
			req = urllib2.Request(self.URL,
				toSend, 
				headers = {"Accept": "*/*",
					"User-Agent": "Mozilla/4.0 (compatible; MSIE 5.5; Windows NT)",
			})
			
			for i in range(3):
				try:
					f = urllib2.urlopen(req)
					answer = f.read()
					print "ANSWER=", answer
					break
				except Exception, ex:
					print "TraktAPI Exception:", ex

