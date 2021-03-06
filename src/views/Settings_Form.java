/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import connection.Client;
import connection.Server;
import java.io.File;
import java.util.Observable;
import java.util.Observer;
import nodes.Double_Node;
import nodes.Simple_Node;
import objects.Network;
import org.Main;
import reading_files.JsonBlock;
import structures.Simply_Linked_List;

/**
 *
 * @author Francisco Suarez
 */
public class Settings_Form extends javax.swing.JFrame implements Observer {

	private static Settings_Form instance;

	public static Settings_Form getInstance() {
		if (instance == null) {
			instance = new Settings_Form();
		}
		return instance;
	}

	/**
	 * Creates new form Settings_Form
	 */
	public Settings_Form() {
		initComponents();
		this.setLocationRelativeTo(null);
		setTextFields();
	}

	//Metodo para configurar mis textField
	private ValidateJTextField validate_Txt;

	void setTextFields() {
		validate_Txt = new ValidateJTextField();
		validate_Txt.formatIP(txt_ip);
		validate_Txt.formatIP(txt_ipConnection);
		validate_Txt.containsNumbers(txt_port);
		validate_Txt.containsNumbers(txt_portConnection);
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_Logo = new javax.swing.JLabel();
        txt_ip = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        txt_port = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btn_saveIP = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txt_ipConnection = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        txt_portConnection = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closingInstance(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        txt_ip.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        txt_ip.setForeground(new java.awt.Color(153, 153, 153));
        txt_ip.setBorder(null);
        txt_ip.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(64, 74, 84));
        jLabel12.setText("#DIRECCION IP");

        jSeparator7.setBackground(new java.awt.Color(153, 153, 153));

        jSeparator8.setBackground(new java.awt.Color(153, 153, 153));

        txt_port.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        txt_port.setForeground(new java.awt.Color(153, 153, 153));
        txt_port.setBorder(null);
        txt_port.setOpaque(false);

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 25)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(64, 74, 84));
        jLabel13.setText("#PUERTO");

        jLabel28.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(64, 74, 84));
        jLabel28.setText("- Conexion");

        btn_saveIP.setBackground(new java.awt.Color(102, 0, 0));
        btn_saveIP.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btn_saveIP.setForeground(new java.awt.Color(255, 255, 255));
        btn_saveIP.setText("Iniciar App");
        btn_saveIP.setFocusPainted(false);
        btn_saveIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveIPActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 25)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(64, 74, 84));
        jLabel14.setText("#DIRECCION IP");

        txt_ipConnection.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        txt_ipConnection.setForeground(new java.awt.Color(153, 153, 153));
        txt_ipConnection.setBorder(null);
        txt_ipConnection.setOpaque(false);

        jSeparator9.setBackground(new java.awt.Color(153, 153, 153));

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 25)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(64, 74, 84));
        jLabel15.setText("#PUERTO");

        txt_portConnection.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        txt_portConnection.setForeground(new java.awt.Color(153, 153, 153));
        txt_portConnection.setBorder(null);
        txt_portConnection.setOpaque(false);

        jSeparator10.setBackground(new java.awt.Color(153, 153, 153));

        jLabel29.setFont(new java.awt.Font("Berlin Sans FB", 0, 48)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(64, 74, 84));
        jLabel29.setText("- Configuracion de Red");

        jLabel30.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(64, 74, 84));
        jLabel30.setText("- Propia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(btn_saveIP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13)
                                .addComponent(txt_port, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                .addComponent(jSeparator7)
                                .addComponent(txt_ip)
                                .addComponent(jSeparator8))
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15)
                            .addComponent(txt_portConnection, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txt_ipConnection)
                            .addComponent(jSeparator9)
                            .addComponent(jSeparator10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel29)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ipConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel28))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel12)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_port, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_portConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(btn_saveIP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1042, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveIPActionPerformed
		// TODO add your handling code here:
		Alerts a = new Alerts();
		String ip = txt_ip.getText();
		String port = txt_port.getText();
		boolean flag = validateTXTs(new String[]{ip, port});
		if (flag) {
			//Declaramos la ip de nuestra instacia
			Main.ipInstance = ip;
			//Declaramos el puerto de nuestra instancia
			Main.portInstance = Integer.parseInt(port);
			//Iniciamos el servidor
			Server server = new Server(Main.portInstance);
			//Agregamos el observable
			server.addObserver(this);
			//Lo montamos en un hilo
			Thread s = new Thread(server);
			s.start();
			//Si vamos a escuchar a alguna otra istancia
			String ipC = txt_ipConnection.getText();
			String portC = txt_portConnection.getText();
			if (validateTXTs(new String[]{ipC, portC})) {
				System.out.println("Vamos a enviar nuestra red");
				Network net = new Network(ip, Main.portInstance);
				Client client = new Client(ipC, Integer.parseInt(portC), net);
				Thread c = new Thread(client);
				c.start();
			} else {
				//Ya que no va a escuchar a nadie sera la primera isntancia 
				//Agregamas el nodo de red a la lista
				Main.networkNodes.addFirst(new Network(ip, Main.portInstance));
			}
			//Creamos la carpeta de la instancia declarada
			File directory = new File("C:/app" + ip + "_" + port);
			directory.mkdirs();
			//Procedemos a leer el archivo de la carpeta si es que existe
			JsonBlock.getInstance().readJsonFile();
			//Abrimos el login para registrarse
			Login log = new Login();
			log.setVisible(true);
			dispose();
		} else {
			a.define("Existen campos invalidos");
		}
    }//GEN-LAST:event_btn_saveIPActionPerformed

    private void closingInstance(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closingInstance
		// TODO add your handling code here:
		//Cuando se cierre la instancia procedemos a eliminar de la lista este nodo de la red
		deleteNetwork();
		//Seteamos la lista de nodos en la red
		for (Simple_Node aux = Main.networkNodes.getFirst(); aux != null; aux = aux.getNext()) {
			Network tmp = (Network) aux.getData();
			Client client = new Client(tmp.getAddress(), tmp.getPort(), Main.networkNodes);
			Thread c = new Thread(client);
			c.start();
		}
    }//GEN-LAST:event_closingInstance

	public void deleteNetwork() {
		for (Simple_Node aux = Main.networkNodes.getFirst(); aux != null; aux = aux.getNext()) {
			Network tmp = (Network) aux.getData();
			if (tmp.getAddress().equals(Main.ipInstance) && tmp.getPort() == Main.portInstance) {
				System.out.println("Encontrada");
				Main.networkNodes.remove(tmp);
				break;
			}
		}
	}

	public boolean validateTXTs(String[] txts) {
		//Obtenemos los textos
		for (String txt : txts) {
			String aux = txt.trim();
			if (aux.isEmpty()) {
				return false;
			}
		}
		return true;
	}

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
			java.util.logging.Logger.getLogger(Settings_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Settings_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Settings_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Settings_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Settings_Form().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_saveIP;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JTextField txt_ip;
    private javax.swing.JTextField txt_ipConnection;
    private javax.swing.JTextField txt_port;
    private javax.swing.JTextField txt_portConnection;
    // End of variables declaration//GEN-END:variables

	@Override
	public void update(Observable o, Object arg) {
		//Si se recibe una Lista simplente enlazada, estamos recibiendo la lista de nodos de la red actualizada
		if (arg instanceof Simply_Linked_List) {
			Main.networkNodes = (Simply_Linked_List) arg;
		} //Si recibimos un objeto network, debemos agregar a la lista de nodos de la red esta nueva red
		else if (arg instanceof Network) {
			System.out.println("Llega la red xd");
			Main.networkNodes.addFirst((Network) arg);
			
			//Seteamos la lista de nodos en la red
			setNetworks();
			//Enviamos los bloques
			dataBlocks();
		} else if (arg instanceof String) {
			JsonBlock.getInstance().jsonBlock_((String) arg);
		}
	}

	public void setNetworks() {
		//Recorremos la lista de nodos de la red para reenviarla a las instancias activas
		for (Simple_Node aux = Main.networkNodes.getFirst(); aux != null; aux = aux.getNext()) {
			Network tmp = (Network) aux.getData();
			if (tmp.getAddress().compareTo(Main.ipInstance) != 0 || tmp.getPort() != Main.portInstance) {
				Client client = new Client(tmp.getAddress(), tmp.getPort(), Main.networkNodes);
				Thread c = new Thread(client);
				c.start();
			}
		}
	}

	public void dataBlocks() {
		//Recorremos la lista de bloques y los enviamos
		for (Simple_Node aux = Main.networkNodes.getFirst(); aux != null; aux = aux.getNext()) {
			Network tmp = (Network) aux.getData();
			if (tmp.getAddress().compareTo(Main.ipInstance) != 0 || tmp.getPort() != Main.portInstance) {
				for (Double_Node aux1 = Main.blockchainInstance.getFirst(); aux1 != null; aux1 = aux1.getNext()) {
					Client client = new Client(tmp.getAddress(), tmp.getPort(), (String) aux1.getData());
					Thread c = new Thread(client);
					c.start();
				}
			}
		}
	}
}
