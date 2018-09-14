/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.view;

import vistas.viewmodels.ClienteOption;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import presentadores.PresentadorVistaPrincipal;

/**
 *
 * @author elbat
 */
public class VistaPrincipal extends javax.swing.JFrame {
    
    private PresentadorVistaPrincipal presentadorVistaPrincipal;

    /**
     * Creates new form vista
     */
    public VistaPrincipal() {
        initComponents();
        
        this.presentadorVistaPrincipal = new PresentadorVistaPrincipal(this);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appTabbedPane = new javax.swing.JTabbedPane();
        clientesPanel = new javax.swing.JPanel();
        nombreLabel = new javax.swing.JLabel();
        apellidoLabel = new javax.swing.JLabel();
        dniLabel = new javax.swing.JLabel();
        saldoInicialLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        apellidoTextField = new javax.swing.JTextField();
        dniTextField = new javax.swing.JTextField();
        saldoInicialTextField = new javax.swing.JTextField();
        cargarButton = new javax.swing.JButton();
        transferenciasPanel = new javax.swing.JPanel();
        desdeLabel = new javax.swing.JLabel();
        haciaLabel = new javax.swing.JLabel();
        montoLabel = new javax.swing.JLabel();
        montoTextField = new javax.swing.JTextField();
        transferirButton = new javax.swing.JButton();
        desdeComboBox = new javax.swing.JComboBox<>();
        haciaComboBox = new javax.swing.JComboBox<>();
        movimientosPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clientesPanel.setToolTipText("");

        nombreLabel.setText("Nombre :");

        apellidoLabel.setText("Apellido :");

        dniLabel.setText("DNI :");

        saldoInicialLabel.setText("Saldo Inicial :");

        cargarButton.setText("Cargar");
        cargarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout clientesPanelLayout = new javax.swing.GroupLayout(clientesPanel);
        clientesPanel.setLayout(clientesPanelLayout);
        clientesPanelLayout.setHorizontalGroup(
            clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesPanelLayout.createSequentialGroup()
                .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientesPanelLayout.createSequentialGroup()
                        .addContainerGap(316, Short.MAX_VALUE)
                        .addComponent(cargarButton))
                    .addGroup(clientesPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(apellidoLabel)
                            .addComponent(saldoInicialLabel)
                            .addComponent(nombreLabel)
                            .addComponent(dniLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreTextField)
                            .addComponent(apellidoTextField)
                            .addComponent(dniTextField)
                            .addComponent(saldoInicialTextField))))
                .addContainerGap())
        );
        clientesPanelLayout.setVerticalGroup(
            clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoLabel)
                    .addComponent(apellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniLabel)
                    .addComponent(dniTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saldoInicialLabel)
                    .addComponent(saldoInicialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(cargarButton)
                .addContainerGap())
        );

        appTabbedPane.addTab("Clientes", clientesPanel);

        desdeLabel.setText("Desde :");

        haciaLabel.setText("Hacia :");

        montoLabel.setText("Monto :");

        transferirButton.setText("Transferir");
        transferirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transferenciasPanelLayout = new javax.swing.GroupLayout(transferenciasPanel);
        transferenciasPanel.setLayout(transferenciasPanelLayout);
        transferenciasPanelLayout.setHorizontalGroup(
            transferenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferenciasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transferenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transferenciasPanelLayout.createSequentialGroup()
                        .addGroup(transferenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desdeLabel)
                            .addGroup(transferenciasPanelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(transferenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(montoLabel)
                                    .addComponent(haciaLabel))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(transferenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(montoTextField)
                            .addComponent(desdeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(haciaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transferenciasPanelLayout.createSequentialGroup()
                        .addGap(0, 289, Short.MAX_VALUE)
                        .addComponent(transferirButton)))
                .addContainerGap())
        );
        transferenciasPanelLayout.setVerticalGroup(
            transferenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferenciasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transferenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desdeLabel)
                    .addComponent(desdeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(transferenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(haciaLabel)
                    .addComponent(haciaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(transferenciasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(montoLabel)
                    .addComponent(montoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(transferirButton)
                .addContainerGap())
        );

        appTabbedPane.addTab("Transferencias", transferenciasPanel);

        javax.swing.GroupLayout movimientosPanelLayout = new javax.swing.GroupLayout(movimientosPanel);
        movimientosPanel.setLayout(movimientosPanelLayout);
        movimientosPanelLayout.setHorizontalGroup(
            movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        movimientosPanelLayout.setVerticalGroup(
            movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );

        appTabbedPane.addTab("Movimientos", movimientosPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarButtonActionPerformed
        this.presentadorVistaPrincipal.guardarDatosPersonales();
    }//GEN-LAST:event_cargarButtonActionPerformed

    private void transferirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferirButtonActionPerformed
        this.presentadorVistaPrincipal.realizarTransferencia();
    }//GEN-LAST:event_transferirButtonActionPerformed

    public JTextField getApellidoTextField() {
        return apellidoTextField;
    }

    public JTextField getDniTextField() {
        return dniTextField;
    }

    public JTextField getNombreTextField() {
        return nombreTextField;
    }

    public JTextField getSaldoInicialTextField() {
        return saldoInicialTextField;
    }

    public JComboBox<ClienteOption> getDesdeComboBox() {
        return desdeComboBox;
    }

    public JComboBox<ClienteOption> getHaciaComboBox() {
        return haciaComboBox;
    }

    public JTextField getMontoTextField() {
        return montoTextField;
    }
   
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JTextField apellidoTextField;
    private javax.swing.JTabbedPane appTabbedPane;
    private javax.swing.JButton cargarButton;
    private javax.swing.JPanel clientesPanel;
    private javax.swing.JComboBox<vistas.viewmodels.ClienteOption> desdeComboBox;
    private javax.swing.JLabel desdeLabel;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField dniTextField;
    private javax.swing.JComboBox<vistas.viewmodels.ClienteOption> haciaComboBox;
    private javax.swing.JLabel haciaLabel;
    private javax.swing.JLabel montoLabel;
    private javax.swing.JTextField montoTextField;
    private javax.swing.JPanel movimientosPanel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel saldoInicialLabel;
    private javax.swing.JTextField saldoInicialTextField;
    private javax.swing.JPanel transferenciasPanel;
    private javax.swing.JButton transferirButton;
    // End of variables declaration//GEN-END:variables
}