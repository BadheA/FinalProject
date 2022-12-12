/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ResearchScientistRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ResearchDeptEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.ResearchAssistantOrg;
import Business.UserAccount.UserAccount;
import Business.Visitor.Phase;
import Business.Visitor.Visitor;
import Business.Visitor.Week;
import Business.WorkQueue.ResearchAssistantWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Abhishek Badhe
 */
public class ManageVolunteersJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private Organization researchScientistOrganization;
    private EcoSystem business;
    
     /**
     * Creates new form ManageVolunteersJPanel
     * @param userProcessContainer
     * @param userAccount
     * @param enterprise
     * @param business
     * @param researchScientistOrganization
     */
 
    public ManageVolunteersJPanel(JPanel userProcessContainer, Enterprise enterprise,UserAccount userAccount,Organization researchScientistOrganization, EcoSystem business,String minAge,String maxAge,String numOfVolunteers) 
    {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account=userAccount;
        this.enterprise = enterprise;
        this.researchScientistOrganization=researchScientistOrganization;
        this.business=business;
        populateTable();
        populateDosesComboBox();
        populateResearchAssistant();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        bpTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rrTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tempTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pulseTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bpTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rrTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tempTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        weightTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        pulseTextField1 = new javax.swing.JTextField();
        yesBtn = new javax.swing.JRadioButton();
        noBtn = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        VolunteerJTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dose2 = new javax.swing.JComboBox<>();
        dose3 = new javax.swing.JComboBox<>();
        dose4 = new javax.swing.JComboBox<>();
        dose1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        researchAssistant = new javax.swing.JComboBox();

        jLabel5.setText("Blood pressure :");

        jLabel6.setText("Respiratory rate:");

        jLabel7.setText("Body temperature");

        jLabel8.setText("Weight");

        jLabel9.setText("Pulse rate:");

        jLabel10.setText("Blood pressure :");

        jLabel11.setText("Respiratory rate:");

        jLabel12.setText("Body temperature");

        jLabel13.setText("Weight");

        jLabel14.setText("Pulse rate:");

        yesBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        yesBtn.setText("Yes");
        yesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesBtnActionPerformed(evt);
            }
        });

        noBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        noBtn.setText("No");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel4.setText("Interested in Organ Donation?");

        workRequestJTable.setBackground(new java.awt.Color(204, 255, 204));
        workRequestJTable.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sender", "Status", "Result"
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
        jScrollPane1.setViewportView(workRequestJTable);

        setBackground(new java.awt.Color(204, 204, 255));

        VolunteerJTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VolunteerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VolunteerName", "Age", "RespiratoryRate", "HeartRate", "BloodPressure", "Weight", "Temperature"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(VolunteerJTable);
        if (VolunteerJTable.getColumnModel().getColumnCount() > 0) {
            VolunteerJTable.getColumnModel().getColumn(0).setResizable(false);
            VolunteerJTable.getColumnModel().getColumn(1).setResizable(false);
            VolunteerJTable.getColumnModel().getColumn(2).setResizable(false);
            VolunteerJTable.getColumnModel().getColumn(4).setResizable(false);
            VolunteerJTable.getColumnModel().getColumn(5).setResizable(false);
        }

        backBtn.setBackground(new java.awt.Color(204, 204, 255));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/back.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Phase 1 dose ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Phase 2 dose ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Phase 3 dose");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Phase 4 dose");

        dose2.setBackground(new java.awt.Color(204, 204, 255));

        dose3.setBackground(new java.awt.Color(204, 204, 255));

        dose4.setBackground(new java.awt.Color(204, 204, 255));

        dose1.setBackground(new java.awt.Color(204, 204, 255));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Assign doses to volunteer");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Assign to");

        researchAssistant.setBackground(new java.awt.Color(204, 204, 255));
        researchAssistant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                researchAssistantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dose3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dose1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dose2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dose4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(researchAssistant, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dose1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dose2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dose3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(dose4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(researchAssistant, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents
private void populateResearchAssistant(){
    ResearchDeptEnterprise researchDepartmentEnterprise= (ResearchDeptEnterprise)enterprise;
        for( Organization o :researchDepartmentEnterprise.getOrganizationDirectory().getOrganizationList()){
            if(o.getName().equals("ResearchAssistant Organization"))
            {
                 for( UserAccount u :o.getUserAccountDirectory().getUserAccountList()){
          researchAssistant.addItem(u);
                 }
            }
        }
}


    public void populateDosesComboBox(){
   ResearchDeptEnterprise researchDepartmentEnterprise= (ResearchDeptEnterprise)enterprise;
   for(String dose:researchDepartmentEnterprise.getDosesList()){
       dose1.addItem(dose);
       dose2.addItem(dose);
       dose3.addItem(dose);
       dose4.addItem(dose);
       
   }
}
    
    private void populateTable() {
        
   ResearchDeptEnterprise researchDepartmentEnterprise= (ResearchDeptEnterprise)enterprise;
   int minAge=researchDepartmentEnterprise.getMinimumAge();
   int maxAge=researchDepartmentEnterprise.getMaximumAge();
   //int NumOfVolunteers=researchDepartmentEnterprise.getVolunteerNumber();
   
   DefaultTableModel model = (DefaultTableModel) VolunteerJTable.getModel();
   Enterprise.EnterpriseType type = Enterprise.EnterpriseType.Hospital;
   model.setRowCount(0);
   for (Network network: business.getNetworkList()) {
    for (Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()) {
    if (enterprise.getEnterpriseType()==type) {
       enterprise.getOrganizationDirectory().getOrganizationList().stream().filter((organization) -> (organization.getName().equals("Visitor Organization"))).forEachOrdered((organization) -> {
            for (Visitor v: organization.getVisitorDirectory().getVisitorList()) {
                try{
                    if (v.isVolunteer()&&v.getAge()>minAge&&v.getAge()<maxAge) {
                        
                    
                        if(v.getSelectedBy().equals("")||v.getSelectedBy()==null)
          {
              
                    Object[] row = new Object[7];
                    row[0] = v;
                    row[1] = v.getAge();
                    row[2] = v.getCurrVital().getRespiratoryRate();
                    row[3] = v.getCurrVital().getHeartRate();
                    row[4] = v.getCurrVital().getBp();
                    row[5] = v.getCurrVital().getWeightKls();
                    row[6] = v.getCurrVital().getTemp();
                    model.addRow(row);
                }}}
                catch(Exception e){
                    Object[] row = new Object[7];
                    row[0] = v;
                    row[1] = v.getAge();
                    row[2] = v.getCurrVital().getRespiratoryRate();
                    row[3] = v.getCurrVital().getHeartRate();
                    row[4] = v.getCurrVital().getBp();
                    row[5] = v.getCurrVital().getWeightKls();
                    row[6] = v.getCurrVital().getTemp();
                    model.addRow(row);
                        }
            }
        });
     }

    }


   }
  }
    private void yesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      int selectedRow = VolunteerJTable.getSelectedRow();
        
        if (selectedRow < 0){
            
             JOptionPane.showMessageDialog(null, "Please select a row to process");
            return;
        }
        
        
        
    String dose11=(String)(dose1.getSelectedItem());
    String dose12=(String)(dose2.getSelectedItem());
    String dose13=(String)(dose3.getSelectedItem());
    String dose14=(String)(dose4.getSelectedItem());
    
        Visitor visitor = (Visitor)VolunteerJTable.getValueAt(selectedRow, 0);
         ResearchDeptEnterprise researchDepartmentEnterprise= (ResearchDeptEnterprise)enterprise;
         if(researchDepartmentEnterprise.getVolunteerNumber()==0){
           JOptionPane.showMessageDialog(null,"You have already selected required number of volunteers");
           return;
         };
         
         
        //UserAccount researchAssistant2=(UserAccount)(researchAssistant.getSelectedItem());
        for( Organization organization :researchDepartmentEnterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization.getName().equals("ResearchAssistant Organization")){
                for (WorkRequest request: organization.getWorkQueue().getWorkRequestList()){
                    ResearchAssistantWorkRequest  researchAssistantWorkRequest=(ResearchAssistantWorkRequest)request;
                  try{
                      if(researchAssistantWorkRequest.getVolunteerName().equals(visitor.getName())){
                        
                       JOptionPane.showMessageDialog(null,"Request has already been sent for this volunteer");
           return;   
                    }}
                  
                  catch(Exception e){
                      
                  }
                }
            }
        }
        visitor.setSelectedBy(enterprise.getName());
        visitor.setResearchStatus("initialized");
     Phase phase1=visitor.createPhase();
phase1.setPhaseName("Phase1");
phase1.setDose(dose11);
phase1.setPhaseStatus("initialized");
Week week11=phase1.createWeek();
Week week12=phase1.createWeek();
Week week13=phase1.createWeek();
Week week14=phase1.createWeek();
week11.setWeekName("week1");
week11.setWeekStatus("initialized");
week12.setWeekName("week2");
week12.setWeekStatus("initialized");
week13.setWeekName("week3");
week13.setWeekStatus("initialized");
week14.setWeekName("week4");
week14.setWeekStatus("initialized");

         //------------------------------------------------------------------
         Phase phase2=visitor.createPhase();
phase2.setPhaseName("Phase2");
phase2.setDose(dose12);
phase2.setPhaseStatus("initialized");
Week week21=phase2.createWeek();
Week week22=phase2.createWeek();
Week week23=phase2.createWeek();
Week week24=phase2.createWeek();
week21.setWeekName("week1");
week21.setWeekStatus("initialized");
week22.setWeekName("week2");
week22.setWeekStatus("initialized");
week23.setWeekName("week3");
week23.setWeekStatus("initialized");
week24.setWeekName("week4");
week24.setWeekStatus("initialized");

         
         //--------------------------------------------------------------
         Phase phase3=visitor.createPhase();
phase3.setPhaseName("Phase3");
phase3.setDose(dose13);
phase3.setPhaseStatus("initialized");
Week week31=phase3.createWeek();
Week week32=phase3.createWeek();
Week week33=phase3.createWeek();
Week week34=phase3.createWeek();
week31.setWeekName("week1");
week31.setWeekStatus("initialized");
week32.setWeekName("week2");
week32.setWeekStatus("initialized");
week33.setWeekName("week3");
week33.setWeekStatus("initialized");
week34.setWeekName("week4");
week34.setWeekStatus("initialized");

         //----------------------------------------------------------------
       Phase phase4=visitor.createPhase();
phase4.setPhaseName("Phase4");
phase4.setDose(dose14);
phase4.setPhaseStatus("initialized");
Week week41=phase4.createWeek();
Week week42=phase4.createWeek();
Week week43=phase4.createWeek();
Week week44=phase4.createWeek();
week41.setWeekName("week1");
week41.setWeekStatus("initialized");
week42.setWeekName("week2");
week42.setWeekStatus("initialized");
week43.setWeekName("week3");
week43.setWeekStatus("initialized");
week44.setWeekName("week4");
week44.setWeekStatus("initialized");
//------------------------------------------------------------------------------
         
        ResearchAssistantWorkRequest request = new ResearchAssistantWorkRequest();
        UserAccount researchAssistant1=(UserAccount)(researchAssistant.getSelectedItem());
        
            request.setMessage("Research Assistant - please give assigned doses and monitor the volunteer!!");
            request.setSender(account);
            request.setStatus("Sent");
            request.setReceiver(researchAssistant1);
            String name = visitor.getName();
            request.setVolunteerName(name);
         Organization o= null;
       for(Network n: business.getNetworkList()){
           
            for(Enterprise e:n.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof ResearchDeptEnterprise){
                   for(Organization org:  e.getOrganizationDirectory().getOrganizationList()){
                       if(org instanceof ResearchAssistantOrg){
                           o=org;
                           
                       }
                   }
                }
            }
        }
       if(o!=null){
            o.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null,"Research Assistant assigned successfully");
            researchDepartmentEnterprise.setVolunteerNumber(researchDepartmentEnterprise.getVolunteerNumber()-1);
            return;
       }
        else{
            JOptionPane.showMessageDialog(null,"Research Assistant Organization doesn't exist for this enterprise");
            return;
       }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void researchAssistantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_researchAssistantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_researchAssistantActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable VolunteerJTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bpTextField;
    private javax.swing.JTextField bpTextField1;
    private javax.swing.JComboBox<String> dose1;
    private javax.swing.JComboBox<String> dose2;
    private javax.swing.JComboBox<String> dose3;
    private javax.swing.JComboBox<String> dose4;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton noBtn;
    private javax.swing.JTextField pulseTextField;
    private javax.swing.JTextField pulseTextField1;
    private javax.swing.JComboBox researchAssistant;
    private javax.swing.JTextField rrTextField;
    private javax.swing.JTextField rrTextField1;
    private javax.swing.JTextField tempTextField;
    private javax.swing.JTextField tempTextField1;
    private javax.swing.JTextField weightTextField;
    private javax.swing.JTextField weightTextField1;
    private javax.swing.JTable workRequestJTable;
    private javax.swing.JRadioButton yesBtn;
    // End of variables declaration//GEN-END:variables
}
