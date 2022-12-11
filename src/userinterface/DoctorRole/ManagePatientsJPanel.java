/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.LabEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.RadiologyOrg;
import Business.Organization.ScreeningOrg;
import Business.UserAccount.UserAccount;
import Business.Visitor.Visitor;
import Business.Visitor.VitalSigns;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Little Giants
 */

public class ManagePatientsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    JPanel container;
    Enterprise enterprise;
    private UserAccount account;
    EcoSystem business;
    Visitor patient ;
    public ManagePatientsJPanel(JPanel container, Enterprise enterprise,UserAccount account,Visitor patient, EcoSystem business) {
        initComponents();
        this.container = container;
        this.enterprise = enterprise;
        this.account = account;
        this.business=business;
        this.patient=patient;
        PatientName.setText(patient.getName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cholesterol = new javax.swing.JCheckBox();
        diabetes = new javax.swing.JCheckBox();
        hepatitis = new javax.swing.JCheckBox();
        resultStatus = new javax.swing.JButton();
        blood = new javax.swing.JCheckBox();
        cancer = new javax.swing.JCheckBox();
        adviceTest = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bpTextField = new javax.swing.JTextField();
        rrTextField = new javax.swing.JTextField();
        tempTextField = new javax.swing.JTextField();
        weightTextField = new javax.swing.JTextField();
        pulseTextField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        backJButton = new javax.swing.JButton();
        PatientName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Visitor");

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD, 14));
        jLabel2.setText("Tests");

        cholesterol.setBackground(new java.awt.Color(204, 204, 255));
        cholesterol.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cholesterol.setText("Cholesterol");

        diabetes.setBackground(new java.awt.Color(204, 204, 255));
        diabetes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        diabetes.setText("Diabetes");

        hepatitis.setBackground(new java.awt.Color(204, 204, 255));
        hepatitis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hepatitis.setText("Hepatitis B");

        resultStatus.setBackground(new java.awt.Color(204, 204, 204));
        resultStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resultStatus.setText("Test Result Status");
        resultStatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resultStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultStatusActionPerformed(evt);
            }
        });

        blood.setBackground(new java.awt.Color(204, 204, 255));
        blood.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        blood.setText("Blood Test");
        blood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodActionPerformed(evt);
            }
        });

        cancer.setBackground(new java.awt.Color(204, 204, 255));
        cancer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancer.setText("Cancer");

        adviceTest.setBackground(new java.awt.Color(204, 204, 204));
        adviceTest.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adviceTest.setText("Advice Test");
        adviceTest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adviceTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adviceTestActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Blood pressure :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Respiratory rate:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Body temperature");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Weight");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Pulse rate:");

        weightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTextFieldActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(204, 204, 204));
        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 881, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );

        backJButton.setBackground(new java.awt.Color(204, 204, 255));
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/back.png"))); // NOI18N
        backJButton.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        PatientName.setEnabled(false);
        PatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientNameActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/vitalSigns.JPG"))); // NOI18N
        jLabel17.setText("jLabel17");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(pulseTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                        .addComponent(weightTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tempTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rrTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bpTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cholesterol)
                                    .addComponent(cancer)
                                    .addComponent(hepatitis)
                                    .addComponent(adviceTest)
                                    .addComponent(resultStatus)
                                    .addComponent(jLabel2)
                                    .addComponent(blood)
                                    .addComponent(diabetes)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backJButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(tempTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18))
                                    .addComponent(pulseTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(saveBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(blood)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(diabetes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cholesterol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hepatitis)
                                .addGap(47, 47, 47)
                                .addComponent(adviceTest, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resultStatus))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
 public void disableAll(){
    cholesterol.setEnabled(false);
        diabetes.setEnabled(false);
        blood.setEnabled(false);
        cancer.setEnabled(false);
        hepatitis.setEnabled(false);
        bpTextField.setEnabled(false);
            rrTextField.setEnabled(false);
            tempTextField.setEnabled(false);
            weightTextField.setEnabled(false);
            pulseTextField.setEnabled(false);
     
}
  
    public void clearAll(){
        cholesterol.setSelected(false);
        diabetes.setSelected(false);
        blood.setSelected(false);
        cancer.setSelected(false);
        hepatitis.setSelected(false);
    }
    //private ArrayList<Visitor> visitorList;
    private void resultStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultStatusActionPerformed
        List<String> tests =  new ArrayList();
        if(blood.isSelected())
            
        tests.add("Blood test");
        //else 
        //tests.add("No");
        if(diabetes.isSelected())
            tests.add("Diabetes");
        //else
         //   tests.add("No");
        if(cholesterol.isSelected())
            tests.add("Cholesterol test");
        if(cancer.isSelected())
            tests.add("Cancer Test");
        //else
         //   tests.add("No");
        if(hepatitis.isSelected())
            tests.add("hepatitis test");
       // else
         //   tests.add("No");
          Iterator i = tests.iterator();
      System.out.println("here");
      //System.out.println(i.next());
      while (i.hasNext()) {
         System.out.println(i.next());
         //TestName.addItem(i.next());
         
      }
     // Visitor patient = (Visitor)PatientName.getSelectedItem();
      //(String)PatientName.getItemAt(PatientName.getSelectedIndex())
        TestResultsJPanel patientTestRequestJPanel;
        patientTestRequestJPanel = new TestResultsJPanel(container, enterprise,account,patient.getName(),tests, patient);
        container.add("DoctorActivityJPanel", patientTestRequestJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_resultStatusActionPerformed

    private void adviceTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adviceTestActionPerformed

        // Visitor patient = (Visitor)PatientName.getSelectedItem();
         try{
        if(patient.getCurrVital()==null){
             JOptionPane.showMessageDialog(null,"Please save vital signs before advising tests");
            return;
        }
         }
         catch(Exception e){
                JOptionPane.showMessageDialog(null,"Please save vital signs before advising tests");
            return;
         }
 
         
        if(blood.isSelected()==false && diabetes.isSelected()==false && cholesterol.isSelected()==false && hepatitis.isSelected()==false && cancer.isSelected()==false){
            JOptionPane.showMessageDialog(null,"Please advice some test!");
            return;
        }
     
         
        if(blood.isSelected()){
         Organization o= null;
         String name = PatientName.getText();
       for(Network n: business.getNetworkList()){
           
            for(Enterprise e:n.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof LabEnterprise){
                   for(Organization org:  e.getOrganizationDirectory().getOrganizationList()){
                       if(org instanceof ScreeningOrg){
                           o=org;
                           
                       }
                   }
                }
            }
        }
       if(o!=null){
           
          if(o.getWorkQueue().searchRequest(name, "Blood Test")) {
                  JOptionPane.showMessageDialog(null,"Blood test report has already been requested for this patient");
                  blood.setSelected(false);
            return;
          }
           LabTestWorkRequest request = new LabTestWorkRequest();
            request.setMessage("Screening Dept - please look into this issue");
            request.setSender(account);
            request.setStatus("Sent");
            request.setPatientName(name);
            request.setTestName("Blood Test");
            o.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
          
       }
       else{
            JOptionPane.showMessageDialog(null,"Screening Organization doesn't exist");
            return;
       }
     }
        ////////////////-------------------------------------------------------------------------------------------------------------------
        if(diabetes.isSelected()){
         Organization o= null;
         String name = PatientName.getText();
       for(Network n: business.getNetworkList()){
           
            for(Enterprise e:n.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof LabEnterprise){
                   for(Organization org:  e.getOrganizationDirectory().getOrganizationList()){
                       if(org instanceof ScreeningOrg){
                           o=org;
                           
                       }
                   }
                }
            }
        }
       if(o!=null){
              if(o.getWorkQueue().searchRequest(name, "diabetes test")) {
                  JOptionPane.showMessageDialog(null,"diabetes test report has already been requested for this patient");
                  diabetes.setSelected(false);
            return;
          }
              
            LabTestWorkRequest request = new LabTestWorkRequest();
            request.setMessage("Screening Dept - please look into this issue");
            request.setSender(account);
            request.setStatus("Sent");
            request.setPatientName(name);
            request.setTestName("diabetes test");
            o.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
           
       }
        else{
            JOptionPane.showMessageDialog(null,"Screening Organization doesn't exist");
            return;
       }
     }
        ////////////////////////////////////////////----------------------------------------------------------------------------------
        if(cholesterol.isSelected()){
          
         Organization o= null;
         
            String name = PatientName.getText();
       for(Network n: business.getNetworkList()){
           
            for(Enterprise e:n.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof LabEnterprise){
                   for(Organization org:  e.getOrganizationDirectory().getOrganizationList()){
                       if(org instanceof ScreeningOrg){
                           o=org;
                           
                       }
                   }
                }
            }
        }
       if(o!=null){
                if(o.getWorkQueue().searchRequest(name, "cholesterol test")) {
                  JOptionPane.showMessageDialog(null,"cholesterol test report has already been requested for this patient");
                  cholesterol.setSelected(false);
            return;
          }
                  LabTestWorkRequest request = new LabTestWorkRequest();
            request.setMessage("Screening Dept - please look into this issue");
            request.setSender(account);
            request.setStatus("Sent");
            request.setPatientName(name);
            request.setTestName("cholesterol test");
            o.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
           
       }
        else{
            JOptionPane.showMessageDialog(null,"Screening Organization doesn't exist");
            return;
       }
     }
        //////////////////////-----------------------------------------------------------------------------------------------------------------------
        if(cancer.isSelected()){
            Organization o= null;
           String name = PatientName.getText();
       for(Network n: business.getNetworkList()){
            for(Enterprise e:n.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof LabEnterprise){
                   for(Organization org:  e.getOrganizationDirectory().getOrganizationList()){
                       if(org instanceof RadiologyOrg){
                           o=org;
                           
                       }
                   }
                }
            }
        }
       if(o!=null){
                 if(o.getWorkQueue().searchRequest(name, "cancer test")) {
                  JOptionPane.showMessageDialog(null,"cancer test report has already been requested for this patient");
                  cancer.setSelected(false);
            return;
          }
                 
            LabTestWorkRequest request = new LabTestWorkRequest();
            request.setMessage("Radiology Dept - please look into this issue");
            request.setSender(account);
            request.setStatus("Sent");
            request.setPatientName(name);
            request.setTestName("cancer test");
            o.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
           
       }
        else{
            JOptionPane.showMessageDialog(null,"Radiology Organization doesn't exist");
            return;
       }
        }
        ///////////////////////////////----------------------------------------------------------------------------------------------------
         if(hepatitis.isSelected()){
            Organization o= null;
           String name = PatientName.getText();
       for(Network n: business.getNetworkList()){
            for(Enterprise e:n.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof LabEnterprise){
                   for(Organization org:  e.getOrganizationDirectory().getOrganizationList()){
                       if(org instanceof RadiologyOrg){
                           o=org;
                           
                       }
                   }
                }
            }
        }
       if(o!=null){
                 if(o.getWorkQueue().searchRequest(name, "hepatitis test")) {
                  JOptionPane.showMessageDialog(null,"hepatitis test report has already been requested for this patient");
                  hepatitis.setSelected(false);
            return;
          }
                 
            LabTestWorkRequest request = new LabTestWorkRequest();
            request.setMessage("Radiology Dept - please look into this issue");
            request.setSender(account);
            request.setStatus("Sent");
            request.setPatientName(name);
            request.setTestName("hepatitis test");
            o.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
           
       }
        else{
            JOptionPane.showMessageDialog(null,"Radiology Organization doesn't exist");
            return;
       }
        }
                if(blood.isSelected()==true || diabetes.isSelected()==true || cholesterol.isSelected()==true){
            JOptionPane.showMessageDialog(null,"Tests sent to external lab, Screening Dept for analysis!");
          
        }
         if(hepatitis.isSelected()==true || cancer.isSelected()==true){
            JOptionPane.showMessageDialog(null,"Tests sent to external lab, Radiology Dept for analysis!");
            
        }
       clearAll();
      
    }//GEN-LAST:event_adviceTestActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
  //all fields should be filled
  
     
   
        if(bpTextField.equals("") || rrTextField.equals("") || tempTextField.equals("") || weightTextField.equals("") || pulseTextField.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all the details.");
            return;
        }
      
        int bp;
        int rr;
        int temp;
        int pulse;
        float weight;
        
        try
           {
        
        bp = Integer.parseInt(bpTextField.getText());
        
           }
           catch(NumberFormatException e)
           {
            JOptionPane.showMessageDialog(null , "Invalid blood pressure"); 
            bpTextField.setText("");
            
               return;
           }       
        
        
                    //-------------------------------------------------------------------------------------------------------------------------------
           try
           {
        
         rr = Integer.parseInt(rrTextField.getText());
        
           }
           catch(NumberFormatException e)
           {
            JOptionPane.showMessageDialog(null , "Invalid respiratory rate"); 
           
            rrTextField.setText("");
            
               return;
           }  
           
           
                    //-------------------------------------------------------------------------------------------------------------------------------
              try
           {
        
         temp = Integer.parseInt(tempTextField.getText());
        
           }
           catch(NumberFormatException e)
           {
            JOptionPane.showMessageDialog(null , "Invalid temparature"); 
           
            tempTextField.setText("");
            
               return;
           }  
              
              
                    //-------------------------------------------------------------------------------------------------------------------------------
                 try
           {
        
         weight = Float.parseFloat(weightTextField.getText());
        
           }
           catch(NumberFormatException e)
           {
            JOptionPane.showMessageDialog(null , "Invalid weight"); 
          
            weightTextField.setText("");
            
               return;
           }  
                 
                 
                    //-------------------------------------------------------------------------------------------------------------------------------
                    try
           {
        
         pulse = Integer.parseInt(pulseTextField.getText());
        
           }
           catch(NumberFormatException e)
           {
            JOptionPane.showMessageDialog(null , "Invalid pulse rate"); 
        
            pulseTextField.setText("");
            
               return;
           }  
                    //-------------------------------------------------------------------------------------------------------------------------------
        
        Visitor v = this.patient;
       
        if(v.getCurrVital()==null)
        {
        VitalSigns vs = new VitalSigns();
        vs.setBp(bp);
        vs.setRespiratoryRate(rr);  
        vs.setHeartRate(pulse);
        vs.setTemp(temp);
        vs.setWeightKls(weight);
            v.setCurrVital(vs);
        }
        else
        {
            VitalSigns vs1 = v.newVitalSign(v.getCurrVital());
            vs1.setBp(bp);
        vs1.setRespiratoryRate(rr);  
        vs1.setHeartRate(pulse);
        vs1.setTemp(temp);
        vs1.setWeightKls(weight);
            
        }
        
        
     
        // if(v.isPatientNormal(v.getAge(), rr, pulse, bp, weight, temp)){
               
           JOptionPane.showMessageDialog(null,"Vital signs are saved");
                
         /*   }
            else{
            
           JOptionPane.showMessageDialog(null,"Vital signs are saved and patient is abnormal..!");
                
            }*/
         
         
            
        int bp3=patient.getCurrVital().getBp();
        int rr3=patient.getCurrVital().getRespiratoryRate();
        int pr3=patient.getCurrVital().getHeartRate();
        int temp3=patient.getCurrVital().getTemp();
        float weight3=patient.getCurrVital().getWeightKls();
         
         if(!patient.isPatientNormal(patient.getAge(),rr3,pr3,bp3, weight3,temp3))
         {
         JOptionPane.showMessageDialog(null,"This patient is not normal! Hence he is not eligible to be a volunteer.");
            boolean eligible=false;
                patient.setVolunteer(eligible);
                patient.setStatus("Completed");
                
        CardLayout layout = (CardLayout)container.getLayout();
        container.remove(this);
      layout.previous(container);
        Component[] comps = this.container.getComponents();
        for(Component comp : comps){
        if(comp instanceof DoctorWorkAreaJPanel){
            DoctorWorkAreaJPanel doctorWorkAreaJPanel= (DoctorWorkAreaJPanel) comp;
            doctorWorkAreaJPanel.populateTable();
            }
        }
       return;
    }
             bpTextField.setText("");
            rrTextField.setText("");
            tempTextField.setText("");
            weightTextField.setText("");
            pulseTextField.setText("");
            
     
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void bloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodActionPerformed
        // TODO add your handling code here:
    
        
        
    }//GEN-LAST:event_bloodActionPerformed

    private void weightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightTextFieldActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
           container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
       dwjp.populateTable();
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void PatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PatientName;
    private javax.swing.JButton adviceTest;
    private javax.swing.JButton backJButton;
    private javax.swing.JCheckBox blood;
    private javax.swing.JTextField bpTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cancer;
    private javax.swing.JCheckBox cholesterol;
    private javax.swing.JCheckBox diabetes;
    private javax.swing.JCheckBox hepatitis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pulseTextField;
    private javax.swing.JButton resultStatus;
    private javax.swing.JTextField rrTextField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField tempTextField;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables
}
