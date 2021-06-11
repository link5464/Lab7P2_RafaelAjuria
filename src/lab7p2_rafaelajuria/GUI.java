/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_rafaelajuria;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author rajur
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Background = new javax.swing.JPanel();
        jPanel_NowPlaying = new javax.swing.JPanel();
        jLabel_MusicIcon = new javax.swing.JLabel();
        jLabel_Song = new javax.swing.JLabel();
        jLabel_Artist = new javax.swing.JLabel();
        jProgressBar_Song = new javax.swing.JProgressBar();
        jLabel_SongLength = new javax.swing.JLabel();
        jLabel_SongCurrent = new javax.swing.JLabel();
        jLabel_Pause = new javax.swing.JLabel();
        jLabel_Previous = new javax.swing.JLabel();
        jLabel_Next = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree_Libreria = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Playlist = new javax.swing.JTable();
        jLabel_LikedSongsIcon = new javax.swing.JLabel();
        jLabel_Playlist = new javax.swing.JLabel();
        jLabel_NombrePlaylist = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spotify Pirata");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel_Background.setBackground(new java.awt.Color(23, 23, 23));

        jPanel_NowPlaying.setBackground(new java.awt.Color(0, 0, 0));

        jLabel_MusicIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab7p2_rafaelajuria/MusicIcon.png"))); // NOI18N
        jLabel_MusicIcon.setToolTipText("");
        jLabel_MusicIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel_MusicIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MusicIconMouseClicked(evt);
            }
        });

        jLabel_Song.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel_Song.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Song.setText("Montero");

        jLabel_Artist.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Artist.setText("Lil Nas X");

        jLabel_SongLength.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SongLength.setText("120");

        jLabel_SongCurrent.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SongCurrent.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_SongCurrent.setText("0");

        jLabel_Pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab7p2_rafaelajuria/Pause.png"))); // NOI18N
        jLabel_Pause.setToolTipText("");

        jLabel_Previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab7p2_rafaelajuria/Previous.png"))); // NOI18N
        jLabel_Previous.setToolTipText("");

        jLabel_Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab7p2_rafaelajuria/Next.png"))); // NOI18N
        jLabel_Next.setToolTipText("");

        javax.swing.GroupLayout jPanel_NowPlayingLayout = new javax.swing.GroupLayout(jPanel_NowPlaying);
        jPanel_NowPlaying.setLayout(jPanel_NowPlayingLayout);
        jPanel_NowPlayingLayout.setHorizontalGroup(
            jPanel_NowPlayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_NowPlayingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_MusicIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_NowPlayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_NowPlayingLayout.createSequentialGroup()
                        .addGroup(jPanel_NowPlayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Song, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jLabel_Artist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel_Previous, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Pause, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_NowPlayingLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel_SongCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar_Song, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_SongLength, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_NowPlayingLayout.setVerticalGroup(
            jPanel_NowPlayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_NowPlayingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_NowPlayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_MusicIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_NowPlayingLayout.createSequentialGroup()
                        .addGroup(jPanel_NowPlayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_NowPlayingLayout.createSequentialGroup()
                                .addComponent(jLabel_Song)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_Artist))
                            .addComponent(jLabel_Previous, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel_NowPlayingLayout.createSequentialGroup()
                                .addGroup(jPanel_NowPlayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Pause, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_NowPlayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_SongLength, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jProgressBar_Song, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_SongCurrent, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        jTree_Libreria.setBackground(new java.awt.Color(153, 153, 153));
        jTree_Libreria.setForeground(new java.awt.Color(255, 255, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Libreria");
        jTree_Libreria.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree_Libreria.setToolTipText("");
        jScrollPane1.setViewportView(jTree_Libreria);

        jTable_Playlist.setBackground(new java.awt.Color(51, 51, 51));
        jTable_Playlist.setForeground(new java.awt.Color(51, 51, 51));
        jTable_Playlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cancion", "Album", "Artista", "Genero"
            }
        ));
        jScrollPane2.setViewportView(jTable_Playlist);
        if (jTable_Playlist.getColumnModel().getColumnCount() > 0) {
            jTable_Playlist.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel_LikedSongsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab7p2_rafaelajuria/PlaylistIcon.png"))); // NOI18N

        jLabel_Playlist.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel_Playlist.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Playlist.setText("Playlist");

        jLabel_NombrePlaylist.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel_NombrePlaylist.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NombrePlaylist.setText("Your Mix");

        javax.swing.GroupLayout jPanel_BackgroundLayout = new javax.swing.GroupLayout(jPanel_Background);
        jPanel_Background.setLayout(jPanel_BackgroundLayout);
        jPanel_BackgroundLayout.setHorizontalGroup(
            jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_NowPlaying, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_BackgroundLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_BackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel_LikedSongsIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Playlist, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_NombrePlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_BackgroundLayout.setVerticalGroup(
            jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BackgroundLayout.createSequentialGroup()
                .addGroup(jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_LikedSongsIcon)
                            .addGroup(jPanel_BackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel_Playlist)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_NombrePlaylist)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_NowPlaying, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_MusicIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MusicIconMouseClicked
        // ConstruitLibreria
        DefaultTreeModel Libreria=(DefaultTreeModel) jTree_Libreria.getModel();
        DefaultMutableTreeNode Root = (DefaultMutableTreeNode) Libreria.getRoot();
        for(int i=0;i<2;i++)//Agregar Artistas
        {
           DefaultMutableTreeNode Artista = new DefaultMutableTreeNode("LilNasX");
           Root.add(Artista);
           for(int j=0;j<2;j++)//Agregar Albumes
           {
               DefaultMutableTreeNode Album = new DefaultMutableTreeNode("7 EP");
               Artista.add(Album);
               for(int k=0;k<2;k++)
               {
                DefaultMutableTreeNode Cancion = new DefaultMutableTreeNode("Montero");
                Album.add(Cancion);   
               }
           }
        }
        Libreria.reload();
    }//GEN-LAST:event_jLabel_MusicIconMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Artist;
    private javax.swing.JLabel jLabel_LikedSongsIcon;
    private javax.swing.JLabel jLabel_MusicIcon;
    private javax.swing.JLabel jLabel_Next;
    private javax.swing.JLabel jLabel_NombrePlaylist;
    private javax.swing.JLabel jLabel_Pause;
    private javax.swing.JLabel jLabel_Playlist;
    private javax.swing.JLabel jLabel_Previous;
    private javax.swing.JLabel jLabel_Song;
    private javax.swing.JLabel jLabel_SongCurrent;
    private javax.swing.JLabel jLabel_SongLength;
    private javax.swing.JPanel jPanel_Background;
    private javax.swing.JPanel jPanel_NowPlaying;
    private javax.swing.JProgressBar jProgressBar_Song;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Playlist;
    private javax.swing.JTree jTree_Libreria;
    // End of variables declaration//GEN-END:variables
}
