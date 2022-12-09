/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import userinterface.LabAssistantRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ScreeningOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Visitor.Visitor;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek Badhe
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

   JPanel container;
    Enterprise enterprise;
    private UserAccount account;
    EcoSystem business;
    String patient = null;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel container, Enterprise enterprise,UserAccount account, EcoSystem business) {
      initComponents();
        this.container = container;
        this.enterprise = enterprise;
        this.account = account;
        this.business=business;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)PatientJTable.getModel();
        
        model.setRowCount(0);
        
         for( Organization o :enterprise.getOrganizationDirectory().getOrganizationList()){
            //get patients from where they are being stored
            for (Visitor v : o.getVisitorDirectory().getVisitorList())
            {
            Object[] row = new Object[3];
            row[0] = v;
            row[1] = v.getAssignedDoctor();
            row[2] = v.getStatus();
            
            model.addRow(row);
            }
             
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        PatientJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PatientJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "PatientName", "Doctor Assigned", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PatientJTable.setSelectionBackground(new java.awt.Color(88, 177, 159));
        jScrollPane1.setViewportView(PatientJTable);
        if (PatientJTable.getColumnModel().getColumnCount() > 0) {
            PatientJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 58, 1280, 96));

        assignJButton.setBackground(new java.awt.Color(88, 177, 159));
        assignJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 170, -1, -1));

        processJButton.setBackground(new java.awt.Color(88, 177, 159));
        processJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 170, 90, -1));

        refreshJButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/Actions-view-refresh-icon.png"))); // NOI18N
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 20, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = PatientJTable.getSelectedRow();
        
        if (selectedRow < 0){
            
             JOptionPane.showMessageDialog(null, "Please select a row to assign");
            return;
        }
        
        
        
        Visitor patient = (Visitor)PatientJTable.getValueAt(selectedRow, 0);
        try{
         if (!(patient.getAssignedDoctor().equals("")||patient.getAssignedDoctor()==null)){
             JOptionPane.showMessageDialog(null, "This request has already been assigned and is being worked upon by someone");
            return;
        }}
        catch(Exception e){
             
        }
          
        try{
          if (patient.getStatus().equals("Completed")){
             JOptionPane.showMessageDialog(null, "Examination for this patient is already completed");
            return;
        }}
        catch(Exception e){
           
        }
        patient.setAssignedDoctor(account);
        patient.setStatus("Pending");
        populateTable();
        
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
        int selectedRow = PatientJTable.getSelectedRow();
        
        if (selectedRow < 0){
             JOptionPane.showMessageDialog(null, "Please select a row to process");
            return;
        }
        
        
        
        Visitor patient = (Visitor)PatientJTable.getValueAt(selectedRow, 0);
        try{
        if (patient.getStatus().equals("Completed")){
             JOptionPane.showMessageDialog(null, "Examination for this patient is already completed");
            return;
        }}
        catch(Exception e){
            
        }
        try{
          if (patient.getAssignedDoctor().equals("") || patient.getAssignedDoctor()==null){
             JOptionPane.showMessageDialog(null, "Please assign it before processing");
            return;
        }}
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "Please assign it before processing");
            return;
        }
     
        if(!patient.getAssignedDoctor().getUsername().equals(account.getUsername())){
            JOptionPane.showMessageDialog(null, "You are not the assigned user for this patient.");
            return;
        }
        patient.setStatus("Processing");
        ManagePatientsJPanel managePatientsJPanel = new ManagePatientsJPanel(container,enterprise,account,patient, business);
        container.add("managePatientsJPanel", managePatientsJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PatientJTable;
    private javax.swing.JButton assignJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables
}
