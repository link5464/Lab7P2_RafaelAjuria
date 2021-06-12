/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_rafaelajuria;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author rajur
 */
public class GUI extends javax.swing.JFrame {
    ArrayList<Artista> Datos = new ArrayList();
    ArrayList<Artista> Playlist = new ArrayList();

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

        jPopupMenu_MenuLibreria = new javax.swing.JPopupMenu();
        jMenuItem_Titulo = new javax.swing.JMenuItem();
        jMenuItem_Agregar = new javax.swing.JMenuItem();
        jMenuItem_Eliminar = new javax.swing.JMenuItem();
        jMenuItem_Modificar = new javax.swing.JMenuItem();
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
        jButton_CargarDatos = new javax.swing.JButton();
        jButton_ActualizarLibreria = new javax.swing.JButton();
        jButton_Guardar = new javax.swing.JButton();

        jMenuItem_Titulo.setText("jMenuItem1");
        jMenuItem_Titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_TituloActionPerformed(evt);
            }
        });
        jPopupMenu_MenuLibreria.add(jMenuItem_Titulo);

        jMenuItem_Agregar.setText("Agregar");
        jMenuItem_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AgregarActionPerformed(evt);
            }
        });
        jPopupMenu_MenuLibreria.add(jMenuItem_Agregar);

        jMenuItem_Eliminar.setText("jMenuItem1");
        jMenuItem_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_EliminarActionPerformed(evt);
            }
        });
        jPopupMenu_MenuLibreria.add(jMenuItem_Eliminar);

        jMenuItem_Modificar.setText("jMenuItem1");
        jPopupMenu_MenuLibreria.add(jMenuItem_Modificar);

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
        jLabel_Song.setText("Cancion en Curso");

        jLabel_Artist.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Artist.setText("Artista");

        jLabel_SongLength.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SongLength.setText("120");

        jLabel_SongCurrent.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SongCurrent.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_SongCurrent.setText("0");

        jLabel_Pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab7p2_rafaelajuria/Pause.png"))); // NOI18N
        jLabel_Pause.setToolTipText("");
        jLabel_Pause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PauseMouseClicked(evt);
            }
        });

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
        jTree_Libreria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree_LibreriaMouseClicked(evt);
            }
        });
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
        jLabel_LikedSongsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LikedSongsIconMouseClicked(evt);
            }
        });

        jLabel_Playlist.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel_Playlist.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Playlist.setText("Playlist");

        jLabel_NombrePlaylist.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel_NombrePlaylist.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NombrePlaylist.setText("Your Mix");

        jButton_CargarDatos.setText("Cargar Datos Guardados");
        jButton_CargarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_CargarDatosMouseClicked(evt);
            }
        });

        jButton_ActualizarLibreria.setText("Actualizar Libreria");
        jButton_ActualizarLibreria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_ActualizarLibreriaMouseClicked(evt);
            }
        });

        jButton_Guardar.setText("Guardar");
        jButton_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_GuardarMouseClicked(evt);
            }
        });

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
                        .addGroup(jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_BackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel_Playlist, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_CargarDatos))
                            .addGroup(jPanel_BackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel_NombrePlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_ActualizarLibreria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                                .addGroup(jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_Playlist)
                                    .addComponent(jButton_CargarDatos)
                                    .addComponent(jButton_Guardar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_NombrePlaylist)
                                    .addComponent(jButton_ActualizarLibreria))))
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

    private void jMenuItem_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_EliminarActionPerformed
        // TODO add your handling code here:
        if(NodoSeleccionado.getUserObject() instanceof Artista)
        {
         for(int i=0;i<Datos.size();i++)
         {
            if(((Artista) NodoSeleccionado.getUserObject()).getNombre().equals(Datos.get(i).getNombre()))
            {
                Datos.remove(i);
                JOptionPane.showMessageDialog(this,
                "Artista Eliminado con Exito!");
            }
            
         }
        }
        if(NodoSeleccionado.getUserObject() instanceof Album)
        {
            
            for(int i=0;i<Datos.size();i++)
         {
             if(NodoSeleccionado.getParent().toString().equals(Datos.get(i).getNombre()))
             {
                 ArrayList<Album> TempAlbum=Datos.get(i).getAlbumes();
                 for(int j=0;j<TempAlbum.size();j++)
                 {
                    if(((Album) NodoSeleccionado.getUserObject()).getNombre().equals(TempAlbum.get(j).getNombre()))
                    {
                        TempAlbum.remove(j);
                        Datos.get(i).setAlbumes(TempAlbum);
                    }
                 }
             }
         }
        }
    }//GEN-LAST:event_jMenuItem_EliminarActionPerformed

    private void jMenuItem_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AgregarActionPerformed
        // TODO add your handling code here:
        if(NodoSeleccionado.getUserObject() instanceof Cancion)
        {
            String Cancion = (String)JOptionPane.showInputDialog(null,"Nombre de la Cancion",null);
            int Duracion = Integer.parseInt((String)JOptionPane.showInputDialog(null,"Duracion de la Cancion",null));
            String Compositor = (String)JOptionPane.showInputDialog(null,"Compositor de la Cancion",null);
            String Distribuidor = (String)JOptionPane.showInputDialog(null,"Distribuidor de la Cancion",null);
            String Artista = (String)JOptionPane.showInputDialog(null,"Artista de la Cancion",null);
            String Album = (String)JOptionPane.showInputDialog(null,"Album de la Cancion",null);
        ArrayList<Album> temp = Datos.get(0).getAlbumes();
        temp.get(0).getCanciones().add(new Cancion(Cancion,Duracion,Compositor,Distribuidor,true,Artista,Album));
        Datos.get(0).setAlbumes(temp);  
        }
    }//GEN-LAST:event_jMenuItem_AgregarActionPerformed

    private void jMenuItem_TituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_TituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_TituloActionPerformed

    private void jLabel_LikedSongsIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LikedSongsIconMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel_LikedSongsIconMouseClicked

    private void jTree_LibreriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree_LibreriaMouseClicked
        // TODO add your handling code here:
        if(evt.isMetaDown()){
            //seleccionar un nodo con click derecho
            int row = jTree_Libreria.getClosestRowForLocation(
                evt.getX(), evt.getY());
            jTree_Libreria.setSelectionRow(row);
            Object v1=jTree_Libreria.getSelectionPath().getLastPathComponent();
            NodoSeleccionado=(DefaultMutableTreeNode) v1;
            jPopupMenu_MenuLibreria.show(evt.getComponent(), evt.getX(), evt.getY());

            if(NodoSeleccionado.getUserObject() instanceof Artista){
                ArtistaSeleccionado= (Artista) NodoSeleccionado.getUserObject();
                jMenuItem_Titulo.setText("Menu Artista");
                jMenuItem_Agregar.setText("Agregar Artista");
                jMenuItem_Modificar.setText("Modificar Artista");
                jMenuItem_Eliminar.setText("Eliminar Artista");

            }
            else if(NodoSeleccionado.getUserObject() instanceof Album){
                //ArtistaSeleccionado= (Artista) NodoSeleccionado.getUserObject();
                jMenuItem_Titulo.setText("Menu Album");
                jMenuItem_Agregar.setText("Agregar Album");
                jMenuItem_Modificar.setText("Modificar Album");
                jMenuItem_Eliminar.setText("Eliminar Album");
            }
            else if(NodoSeleccionado.getUserObject() instanceof Cancion){
                //ArtistaSeleccionado= (Artista) NodoSeleccionado.getUserObject();
                jMenuItem_Titulo.setText("Reproducir Cancion");
                jMenuItem_Agregar.setText("Agregar Cancion");
                jMenuItem_Modificar.setText("Modificar Cancion");
                jMenuItem_Eliminar.setText("Eliminar Cancion");
            }
            else
            {
                jMenuItem_Titulo.setText("Menu Libreria");
                jMenuItem_Agregar.setText("---");
                jMenuItem_Modificar.setText("---");
                jMenuItem_Eliminar.setText("---");
            }
        }
    }//GEN-LAST:event_jTree_LibreriaMouseClicked

    private void jLabel_PauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PauseMouseClicked
        // TODO add your handling code here:
        int Max=10;
        jProgressBar_Song.setMaximum(Max*10);
        jLabel_SongLength.setText("10");
        ProgressBarThread AdminBarra = new ProgressBarThread(jProgressBar_Song,jLabel_SongCurrent);
        AdminBarra.start();
    }//GEN-LAST:event_jLabel_PauseMouseClicked

    private void jLabel_MusicIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MusicIconMouseClicked
        Datos.add(new Artista("Artista","Genero","Disquera","Alias","Tipo"));
        Datos.get(0).getAlbumes().add(new Album("Album","Fecha","Genero","Formato","Productor"));
        ArrayList<Album> temp = Datos.get(0).getAlbumes();
        temp.get(0).getCanciones().add(new Cancion("Cancion",120,"Compositor","Distribuidor",true,"Artista","Album"));
        Datos.get(0).setAlbumes(temp);
        
    }//GEN-LAST:event_jLabel_MusicIconMouseClicked

    private void jButton_CargarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CargarDatosMouseClicked
        // TODO add your handling code here:
        AdministrarDatos Admin = new AdministrarDatos("./Datos.pirata");
        Admin.LoadMusic();
        Datos=Admin.getDatos();
        DefaultTreeModel Libreria=(DefaultTreeModel) jTree_Libreria.getModel();
        DefaultMutableTreeNode Root = (DefaultMutableTreeNode) Libreria.getRoot();
        Root.removeAllChildren();
        for(int i=0;i<Datos.size();i++)//Agregar Artistas
        {
            DefaultMutableTreeNode Artista = new DefaultMutableTreeNode(new Artista(Datos.get(i).getNombre(),Datos.get(i).getGenero(),Datos.get(i).getDisquera(),Datos.get(i).getAlias(),Datos.get(i).getTipo()));
            Root.add(Artista);
            for(int j=0;j<Datos.get(i).getAlbumes().size();j++)//Agregar Albumes
            {
                ArrayList<Album> AlbumTemp = Datos.get(i).getAlbumes();
                DefaultMutableTreeNode Album = new DefaultMutableTreeNode(new Album(AlbumTemp.get(j).getNombre(),AlbumTemp.get(j).getFecha(),AlbumTemp.get(j).getGenero(),AlbumTemp.get(j).getFormato(),AlbumTemp.get(j).getProductor()));
                Artista.add(Album);
                for(int k=0;k<AlbumTemp.get(j).getCanciones().size();k++)//Agregar Canciones
                {
                    ArrayList<Cancion> CancionTemp =AlbumTemp.get(j).getCanciones();
                    DefaultMutableTreeNode Cancion = new DefaultMutableTreeNode(new Cancion(CancionTemp.get(k).getNombre(),CancionTemp.get(k).getDuracion(),CancionTemp.get(k).getCompositor(),CancionTemp.get(k).getDistribuidor(),CancionTemp.get(k).getExclusiva(),CancionTemp.get(k).getArtista(),CancionTemp.get(k).getAlbum()));
                    Album.add(Cancion);
                }
            }
        }
        Libreria.reload();
    }//GEN-LAST:event_jButton_CargarDatosMouseClicked

    private void jButton_ActualizarLibreriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ActualizarLibreriaMouseClicked
        // TODO add your handling code here:
        DefaultTreeModel Libreria=(DefaultTreeModel) jTree_Libreria.getModel();
        DefaultMutableTreeNode Root = (DefaultMutableTreeNode) Libreria.getRoot();
        Root.removeAllChildren();
        for(int i=0;i<Datos.size();i++)//Agregar Artistas
        {
            DefaultMutableTreeNode Artista = new DefaultMutableTreeNode(new Artista(Datos.get(i).getNombre(),Datos.get(i).getGenero(),Datos.get(i).getDisquera(),Datos.get(i).getAlias(),Datos.get(i).getTipo()));
            Root.add(Artista);
            for(int j=0;j<Datos.get(i).getAlbumes().size();j++)//Agregar Albumes
            {
                ArrayList<Album> AlbumTemp = Datos.get(i).getAlbumes();
                DefaultMutableTreeNode Album = new DefaultMutableTreeNode(new Album(AlbumTemp.get(j).getNombre(),AlbumTemp.get(j).getFecha(),AlbumTemp.get(j).getGenero(),AlbumTemp.get(j).getFormato(),AlbumTemp.get(j).getProductor()));
                Artista.add(Album);
                for(int k=0;k<AlbumTemp.get(j).getCanciones().size();k++)//Agregar Canciones
                {
                    ArrayList<Cancion> CancionTemp =AlbumTemp.get(j).getCanciones();
                    DefaultMutableTreeNode Cancion = new DefaultMutableTreeNode(new Cancion(CancionTemp.get(k).getNombre(),CancionTemp.get(k).getDuracion(),CancionTemp.get(k).getCompositor(),CancionTemp.get(k).getDistribuidor(),CancionTemp.get(k).getExclusiva(),CancionTemp.get(k).getArtista(),CancionTemp.get(k).getAlbum()));
                    Album.add(Cancion);
                }
            }
        }
        Libreria.reload();
    }//GEN-LAST:event_jButton_ActualizarLibreriaMouseClicked

    private void jButton_GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_GuardarMouseClicked
        // TODO add your handling code here:
        AdministrarDatos Admin = new AdministrarDatos("./Datos.pirata");
        Admin.LoadMusic();
        Admin.setDatos(Datos);
        Admin.WriteFile();
        JOptionPane.showMessageDialog(this,
            "Datos Guardados!");
    }//GEN-LAST:event_jButton_GuardarMouseClicked

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
    private javax.swing.JButton jButton_ActualizarLibreria;
    private javax.swing.JButton jButton_CargarDatos;
    private javax.swing.JButton jButton_Guardar;
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
    private javax.swing.JMenuItem jMenuItem_Agregar;
    private javax.swing.JMenuItem jMenuItem_Eliminar;
    private javax.swing.JMenuItem jMenuItem_Modificar;
    private javax.swing.JMenuItem jMenuItem_Titulo;
    private javax.swing.JPanel jPanel_Background;
    private javax.swing.JPanel jPanel_NowPlaying;
    private javax.swing.JPopupMenu jPopupMenu_MenuLibreria;
    private javax.swing.JProgressBar jProgressBar_Song;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Playlist;
    private javax.swing.JTree jTree_Libreria;
    // End of variables declaration//GEN-END:variables
    DefaultMutableTreeNode NodoSeleccionado;
    Artista ArtistaSeleccionado;
}
