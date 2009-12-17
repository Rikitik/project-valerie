/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Settings.java
 *
 * Created on 24.08.2009, 21:38:40
 */

package Gui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Admin
 */
public class Settings extends javax.swing.JDialog {

    /** Creates new form Settings */
    public Settings(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        for (int i = 0; i < jTree1  .getRowCount(); i++) {
            jTree1.expandRow(i);
        }

        jPanelGeneral.setVisible(true);
        jPanelFileManagment.setVisible(false);
        jPanelImportManagment.setVisible(false);

        jLabelHeading.setText("General");

        jTextFieldFilter.setText(new valerie.tools.Properties().getPropertyString("FILTER_SERIES"));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPaneApplyCancel = new javax.swing.JSplitPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSplitPaneTree = new javax.swing.JSplitPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLayeredPaneSettings = new javax.swing.JLayeredPane();
        jPanelGeneral = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanelFileManagment = new javax.swing.JPanel();
        jTextFieldFilter = new javax.swing.JTextField();
        jLabelFilter = new javax.swing.JLabel();
        jPanelImportManagment = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableImportManagment = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabelHeading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(valerie.ValerieApp.class).getContext().getResourceMap(Settings.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        jSplitPaneApplyCancel.setBorder(null);
        jSplitPaneApplyCancel.setDividerSize(0);
        jSplitPaneApplyCancel.setName("jSplitPaneApplyCancel"); // NOI18N

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jSplitPaneApplyCancel.setLeftComponent(jButton1);

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setEnabled(false);
        jButton2.setName("jButton2"); // NOI18N
        jSplitPaneApplyCancel.setRightComponent(jButton2);

        jSplitPaneTree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSplitPaneTree.setDividerSize(1);
        jSplitPaneTree.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPaneTree.setMinimumSize(new java.awt.Dimension(215, 45));
        jSplitPaneTree.setName("jSplitPaneTree"); // NOI18N
        jSplitPaneTree.setPreferredSize(new java.awt.Dimension(215, 45));

        jLabel1.setBackground(resourceMap.getColor("jLabel1.background")); // NOI18N
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel1.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(215, 45));
        jLabel1.setMinimumSize(new java.awt.Dimension(215, 45));
        jLabel1.setName("jLabel1"); // NOI18N
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(215, 45));
        jSplitPaneTree.setTopComponent(jLabel1);

        jScrollPane1.setBorder(null);
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTree1.setBackground(resourceMap.getColor("jTree1.background")); // NOI18N
        jTree1.setFont(resourceMap.getFont("jTree1.font")); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("General");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("File Managment");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Movies");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Import Managment");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("TV");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Import Managment");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setLargeModel(true);
        jTree1.setName("jTree1"); // NOI18N
        jTree1.setRootVisible(false);
        jTree1.setRowHeight(30);
        jTree1.setShowsRootHandles(true);
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        jSplitPaneTree.setRightComponent(jScrollPane1);

        jLayeredPaneSettings.setBackground(resourceMap.getColor("jLayeredPaneSettings.background")); // NOI18N
        jLayeredPaneSettings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPaneSettings.setName("jLayeredPaneSettings"); // NOI18N
        jLayeredPaneSettings.setOpaque(true);

        jPanelGeneral.setName("jPanelGeneral"); // NOI18N
        jPanelGeneral.setOpaque(false);

        jCheckBox1.setText(resourceMap.getString("jCheckBox1.text")); // NOI18N
        jCheckBox1.setName("jCheckBox1"); // NOI18N
        jCheckBox1.setOpaque(false);

        javax.swing.GroupLayout jPanelGeneralLayout = new javax.swing.GroupLayout(jPanelGeneral);
        jPanelGeneral.setLayout(jPanelGeneralLayout);
        jPanelGeneralLayout.setHorizontalGroup(
            jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGeneralLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addGap(31, 31, 31))
        );
        jPanelGeneralLayout.setVerticalGroup(
            jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelGeneral.setBounds(10, 70, 180, 30);
        jLayeredPaneSettings.add(jPanelGeneral, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanelFileManagment.setName("jPanelFileManagment"); // NOI18N
        jPanelFileManagment.setOpaque(false);

        jTextFieldFilter.setText(resourceMap.getString("jTextFieldFilter.text")); // NOI18N
        jTextFieldFilter.setName("jTextFieldFilter"); // NOI18N
        jTextFieldFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFilterActionPerformed(evt);
            }
        });

        jLabelFilter.setText(resourceMap.getString("jLabelFilter.text")); // NOI18N
        jLabelFilter.setName("jLabelFilter"); // NOI18N

        javax.swing.GroupLayout jPanelFileManagmentLayout = new javax.swing.GroupLayout(jPanelFileManagment);
        jPanelFileManagment.setLayout(jPanelFileManagmentLayout);
        jPanelFileManagmentLayout.setHorizontalGroup(
            jPanelFileManagmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFileManagmentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFilter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFileManagmentLayout.setVerticalGroup(
            jPanelFileManagmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFileManagmentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFileManagmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFilter)
                    .addComponent(jTextFieldFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jPanelFileManagment.setBounds(10, 70, 270, 140);
        jLayeredPaneSettings.add(jPanelFileManagment, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanelImportManagment.setBackground(resourceMap.getColor("jPanelImportManagment.background")); // NOI18N
        jPanelImportManagment.setName("jPanelImportManagment"); // NOI18N
        jPanelImportManagment.setOpaque(false);

        jScrollPane2.setBackground(resourceMap.getColor("jScrollPane2.background")); // NOI18N
        jScrollPane2.setName("jScrollPane2"); // NOI18N
        jScrollPane2.setOpaque(false);

        jTableImportManagment.setAutoCreateRowSorter(true);
        jTableImportManagment.setBackground(resourceMap.getColor("jTableImportManagment.background")); // NOI18N
        jTableImportManagment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Path"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableImportManagment.setName("jTableImportManagment"); // NOI18N
        jTableImportManagment.setOpaque(false);
        jScrollPane2.setViewportView(jTableImportManagment);
        jTableImportManagment.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("jTableImportManagment.columnModel.title0")); // NOI18N

        jButton3.setFont(resourceMap.getFont("jButton3.font")); // NOI18N
        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(resourceMap.getFont("jButton4.font")); // NOI18N
        jButton4.setText(resourceMap.getString("jButton4.text")); // NOI18N
        jButton4.setName("jButton4"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelImportManagmentLayout = new javax.swing.GroupLayout(jPanelImportManagment);
        jPanelImportManagment.setLayout(jPanelImportManagmentLayout);
        jPanelImportManagmentLayout.setHorizontalGroup(
            jPanelImportManagmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImportManagmentLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelImportManagmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelImportManagmentLayout.setVerticalGroup(
            jPanelImportManagmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImportManagmentLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelImportManagment.setBounds(10, 70, 510, 140);
        jLayeredPaneSettings.add(jPanelImportManagment, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabelHeading.setBackground(resourceMap.getColor("jLabelHeading.background")); // NOI18N
        jLabelHeading.setFont(resourceMap.getFont("jLabelHeading.font")); // NOI18N
        jLabelHeading.setForeground(resourceMap.getColor("jLabelHeading.foreground")); // NOI18N
        jLabelHeading.setLabelFor(jLayeredPaneSettings);
        jLabelHeading.setText(resourceMap.getString("jLabelHeading.text")); // NOI18N
        jLabelHeading.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelHeading.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelHeading.setName("jLabelHeading"); // NOI18N
        jLabelHeading.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPaneTree, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHeading, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addComponent(jLayeredPaneSettings, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(615, Short.MAX_VALUE)
                .addComponent(jSplitPaneApplyCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabelHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPaneSettings))
                    .addComponent(jSplitPaneTree, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPaneApplyCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
        Object path[] = jTree1.getSelectionPaths()[0].getPath();

        String heading = "";
        for(int i = 1; i < path.length; i++) {
            heading += ((DefaultMutableTreeNode)path[i]).getUserObject();
            
            if(i+1 < path.length)
                heading += " : ";
        }

        jLabelHeading.setText(heading);

        if(((DefaultMutableTreeNode)path[1]).getUserObject().equals("General")) {
            jPanelGeneral.setVisible(true);
            jPanelFileManagment.setVisible(false);
            jPanelImportManagment.setVisible(false);
        } else if(((DefaultMutableTreeNode)path[1]).getUserObject().equals("File Managment")) {
            jPanelFileManagment.setVisible(true);
            jPanelGeneral.setVisible(false);
            jPanelImportManagment.setVisible(false);
        } else if(path.length == 1) {

        } else if(((DefaultMutableTreeNode)path[1]).getUserObject().equals("Movies") && ((DefaultMutableTreeNode)path[2]).getUserObject().equals("Import Managment")) {
            jPanelImportManagment.setVisible(true);
            jPanelGeneral.setVisible(false);
            jPanelFileManagment.setVisible(false);
            String[] pathsMovies = new valerie.tools.Properties().getPropertyString("PATHS_MOVIES").split("\\|");
            ((DefaultTableModel) jTableImportManagment.getModel()).setRowCount(pathsMovies.length);

            int iteratorMovies = 0;
            for(String pathMovies : pathsMovies) {
                    jTableImportManagment.setValueAt(pathMovies, iteratorMovies++, 0);
            }
        } else if(((DefaultMutableTreeNode)path[1]).getUserObject().equals("TV") && ((DefaultMutableTreeNode)path[2]).getUserObject().equals("Import Managment")) {
            jPanelImportManagment.setVisible(true);
            jPanelGeneral.setVisible(false);
            jPanelFileManagment.setVisible(false);
            String[] pathsMovies = new valerie.tools.Properties().getPropertyString("PATHS_SERIES").split("\\|");
            ((DefaultTableModel) jTableImportManagment.getModel()).setRowCount(pathsMovies.length);

            int iteratorMovies = 0;
            for(String pathMovies : pathsMovies) {
                    jTableImportManagment.setValueAt(pathMovies, iteratorMovies++, 0);
            }
        }
    }//GEN-LAST:event_jTree1ValueChanged

    private void jTextFieldFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFilterActionPerformed
        valerie.tools.Properties prop = new valerie.tools.Properties();
        prop.setProperty("FILTER_MOVIES", jTextFieldFilter.getText());
        prop.setProperty("FILTER_SERIES", jTextFieldFilter.getText());

        prop.save();
    }//GEN-LAST:event_jTextFieldFilterActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        valerie.tools.Properties prop = new valerie.tools.Properties();

        String pathToAdd = JOptionPane.showInputDialog("New Directory:");
        if(pathToAdd != null && pathToAdd.length() > 0) {
            Object path[] = jTree1.getSelectionPaths()[0].getPath();
            if(((DefaultMutableTreeNode)path[1]).getUserObject().equals("Movies") && ((DefaultMutableTreeNode)path[2]).getUserObject().equals("Import Managment")) {
                String paths = prop.getPropertyString("PATHS_MOVIES");
                if(!paths.contains(pathToAdd))
                    prop.setProperty("PATHS_MOVIES", paths + pathToAdd + "|");

            } else if(((DefaultMutableTreeNode)path[1]).getUserObject().equals("TV") && ((DefaultMutableTreeNode)path[2]).getUserObject().equals("Import Managment")) {
                String paths = prop.getPropertyString("PATHS_SERIES");
                if(!paths.contains(pathToAdd))
                    prop.setProperty("PATHS_SERIES", paths + pathToAdd + "|");
            }
        }

        prop.save();

        jTree1ValueChanged(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        valerie.tools.Properties prop = new valerie.tools.Properties();

        Object path[] = jTree1.getSelectionPaths()[0].getPath();
        if(((DefaultMutableTreeNode)path[1]).getUserObject().equals("Movies") && ((DefaultMutableTreeNode)path[2]).getUserObject().equals("Import Managment")) {
            String pathToDelete = jTableImportManagment.getValueAt(jTableImportManagment.getSelectedRow(), jTableImportManagment.getSelectedColumn()).toString();

            String paths = prop.getPropertyString("PATHS_MOVIES");
            paths = paths.replaceAll(pathToDelete + "\\|", "");

            prop.setProperty("PATHS_MOVIES", paths);

        } else if(((DefaultMutableTreeNode)path[1]).getUserObject().equals("TV") && ((DefaultMutableTreeNode)path[2]).getUserObject().equals("Import Managment")) {
            String pathToDelete = jTableImportManagment.getValueAt(jTableImportManagment.getSelectedRow(), jTableImportManagment.getSelectedColumn()).toString();

            String paths = prop.getPropertyString("PATHS_SERIES");
            paths = paths.replaceAll((pathToDelete + "\\|"), "");

            prop.setProperty("PATHS_SERIES", paths);
        }

        prop.save();

        jTree1ValueChanged(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFilter;
    private javax.swing.JLabel jLabelHeading;
    private javax.swing.JLayeredPane jLayeredPaneSettings;
    private javax.swing.JPanel jPanelFileManagment;
    private javax.swing.JPanel jPanelGeneral;
    private javax.swing.JPanel jPanelImportManagment;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPaneApplyCancel;
    private javax.swing.JSplitPane jSplitPaneTree;
    private javax.swing.JTable jTableImportManagment;
    private javax.swing.JTextField jTextFieldFilter;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables

}