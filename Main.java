//package student.information.system;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
public class AddStudent extends javax.swing.JFrame {
static int id=101;
public AddStudent() {
initComponents();
sid.setText(String.valueOf(id));
id++;
sid.enable(false);
}
@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">
private void initComponents() {
ButtonGroup buttonGroup1 = new javax.swing.ButtonGroup();
ButtonGroup buttonGroup2 = new javax.swing.ButtonGroup();
sid = new javax.swing.JTextField();
sname = new javax.swing.JTextField();
jLabel3 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
jLabel5 = new javax.swing.JLabel();
sdob = new javax.swing.JTextField();
jLabel6 = new javax.swing.JLabel();
scontact = new javax.swing.JTextField();
jLabel7 = new javax.swing.JLabel();
jLabel1 = new javax.swing.JLabel();
jScrollPane1 = new javax.swing.JScrollPane();
sadd = new javax.swing.JTextArea();
LBL1 = new javax.swing.JLabel();
jRadioButton1 = new javax.swing.JRadioButton();
jRadioButton2 = new javax.swing.JRadioButton();
jButton1 = new javax.swing.JButton();
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
sid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
sid.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
sidActionPerformed(evt);
}
});
sname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jLabel3.setText("STUDENT NAME");
jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jLabel4.setText("STUDENT ADDRESS");
jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jLabel5.setText("STUDENT GENDER");
sdob.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jLabel6.setText("STUDENT DOB");
scontact.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jLabel7.setText("STUDENT CONTACT NO");
jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
jLabel1.setText("STUDENT DATA FORM ");
sadd.setColumns(20);
sadd.setRows(5);
jScrollPane1.setViewportView(sadd);
LBL1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
LBL1.setText("STUDENT ID");
buttonGroup1.add(jRadioButton1);
jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jRadioButton1.setSelected(true);
jRadioButton1.setText("Male");
buttonGroup1.add(jRadioButton2);
jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jRadioButton2.setText("Female");
jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jButton1.setText("SUBMIT");
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(128, 128, 128)
.addComponent(jLabel1)
.addGap(0, 0, Short.MAX_VALUE))
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addGroup(layout.createSequentialGroup()
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jButton1))
.addGroup(layout.createSequentialGroup()
.addGap(37, 37, 37)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(LBL1)
.addComponent(jLabel5)
.addComponent(jLabel6)
.addComponent(jLabel7)
.addComponent(jLabel3)
.addComponent(jLabel4))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addGroup(layout.createSequentialGroup()
.addComponent(jRadioButton1)
.addGap(35, 35, 35)
.addComponent(jRadioButton2))
.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
.addComponent(sname)
.addComponent(sid)
.addComponent(scontact)
.addComponent(sdob))))
.addGap(0, 64, Short.MAX_VALUE))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addGap(23, 23, 23)
.addComponent(jLabel1)
.addGap(18, 18, Short.MAX_VALUE)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(LBL1))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel3))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel4))
.addGap(42, 42, 42)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel5)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jRadioButton1)
.addComponent(jRadioButton2)))
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel6)
.addComponent(sdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel7)
.addComponent(scontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(29, 29, 29)
.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap())
);
pack();
}// </editor-fold>
private void sidActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
}   
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {   

String name=sname.getText();
String addr=sadd.getText();
String dob=sdob.getText();
String ct=scontact.getText();
String sex;
if(jRadioButton1.isSelected())
sex="Male";
else
sex="Female";
if(name.isEmpty() || addr.isEmpty() || dob.isEmpty() || ct.isEmpty())
{
JOptionPane.showMessageDialog(null, "opps something left! please enter it");
}
else
{
  
PrintWriter p = null;
try {
File f1 = new File("f:\\students.dat");
p = new PrintWriter(f1);
p.write(sid.getText()+","+name+","+addr+","+sex+","+dob+","+ct+"\n");
p.close();
JOptionPane.showMessageDialog(null, "Student Added successfully");
  
this.setVisible(false);
//new MainScreen().setVisible(true);
} catch (FileNotFoundException ex) {
Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
} finally {
p.close();
}
  
}
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
java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>
/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new AddStudent().setVisible(true);
}
});
}
// Variables declaration - do not modify   
private javax.swing.JLabel LBL1;
private javax.swing.JButton jButton1;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel jLabel5;
private javax.swing.JLabel jLabel6;
private javax.swing.JLabel jLabel7;
private javax.swing.JRadioButton jRadioButton1;
private javax.swing.JRadioButton jRadioButton2;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JTextArea sadd;
private javax.swing.JTextField scontact;
private javax.swing.JTextField sdob;
private javax.swing.JTextField sid;
private javax.swing.JTextField sname;
// End of variables declaration   
}