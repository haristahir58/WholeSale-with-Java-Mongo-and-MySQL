/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wholesaleprojects;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class CRUD extends javax.swing.JFrame {

    /**
     * Creates new form Product_CUD
     */
    
     private static DB database;
    MongoClient dbCon;
    DBCollection table;
    Customerss custDetails= new Customerss();
    
    
    
    
    public CRUD() {
        initComponents();
        dbCon = DBManager.getConnection();
        database = dbCon.getDB("WholeSaleProject");
        table = database.getCollection("Customers");
        
        LoadData();
    }
    
    
    private void LoadData()
    {
        DefaultTableModel model = (DefaultTableModel)jCustomerTable.getModel();
        model.setRowCount(0);
        
        BasicDBObject query = new BasicDBObject();
        BasicDBObject field = new BasicDBObject();
        
        DBCursor cursor = table.find(query,field);
        while(cursor.hasNext())
        {
            BasicDBObject obj = (BasicDBObject)cursor.next();
            Object[] ROW = {obj.getString("nameCustomer"),obj.getString("cityCustomer"),obj.getString("CnicCustomer"),
                obj.getString("phoneCustomer"),obj.getString("amount"),obj.getString("paid"),
                obj.getString("Date"),obj.getString("Quantity"),obj.getString("Price"),obj.getString("Total")};
            
            
            model.addRow(ROW);
            
            
            
        }
        
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtCnic = new javax.swing.JTextField();
        txtPno = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        txtPaid = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jCustomerTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Customers");

        jLabel2.setText("Customer Name");

        jLabel3.setText("Customer's City");

        jLabel4.setText("Cnic ");

        jLabel5.setText("Phone Customer");

        jLabel6.setText("amount");

        jLabel7.setText("paid");

        jLabel8.setText("Date");

        jLabel9.setText("Quantity");

        jLabel10.setText("Price");

        jLabel11.setText("Total");

        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton4.setText("Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jCustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NameCustomer", "City", "CNIC", "Phone", "Amount", "Paid", "Date", "Quantity", "Price", "Total"
            }
        ));
        jCustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCustomerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jCustomerTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(1, 1, 1)))
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(57, 57, 57)))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtCity)
                            .addComponent(txtCnic)
                            .addComponent(txtPno)
                            .addComponent(txtQuantity)
                            .addComponent(txtPrice)
                            .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(106, 106, 106))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtPno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        Customerss newCust = new Customerss();
        newCust.setName(txtName.getText());
        newCust.setCity(txtCity.getText());
        newCust.setCnic(txtCnic.getText());
        newCust.setPhone(txtPno.getText());
        newCust.setAmount(Integer.parseInt(txtAmount.getText()));
        newCust.setPaid(txtPaid.getText());
        newCust.setDate(txtDate.getText());
        newCust.setQuantity(Integer.parseInt(txtQuantity.getText()));
        newCust.setPrice(Integer.parseInt(txtPrice.getText()));
        newCust.setTotal(Integer.parseInt(txtTotal.getText()));
        
        
        DBObject doc = creatDBObject(newCust);
        
        WriteResult result = table.insert(doc);
        LoadData();
        
         
    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void jCustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCustomerTableMouseClicked
        // TODO add your handling code here:
        int index = jCustomerTable.getSelectedRow();
        Object name = jCustomerTable.getModel().getValueAt(index, 0);
        Object city = jCustomerTable.getModel().getValueAt(index, 1);
        Object cnic = jCustomerTable.getModel().getValueAt(index, 2);
        Object phone = jCustomerTable.getModel().getValueAt(index, 3);
        Object amount = jCustomerTable.getModel().getValueAt(index, 4);
        Object paid = jCustomerTable.getModel().getValueAt(index, 5);
        Object date = jCustomerTable.getModel().getValueAt(index, 6);
        Object quantity = jCustomerTable.getModel().getValueAt(index, 7);
        Object price = jCustomerTable.getModel().getValueAt(index, 8);
        Object total = jCustomerTable.getModel().getValueAt(index, 9);
        
       
        
        custDetails.setName((String)name);
        custDetails.setCity((String)city);
        custDetails.setCnic((String)cnic);
        custDetails.setPhone((String)phone);
        custDetails.setAmount(Integer.parseInt(amount.toString()));
        custDetails.setPaid((String)paid);
        custDetails.setDate((String)date);
        custDetails.setQuantity(Integer.parseInt(quantity.toString()));
        custDetails.setPrice(Integer.parseInt(price.toString()));
        custDetails.setTotal(Integer.parseInt(total.toString()));
        
        txtName.setText(name.toString());
        txtCity.setText(city.toString());
        txtCnic.setText(cnic.toString());
        txtPno.setText(phone.toString());
        txtAmount.setText(amount.toString());
        txtPaid.setText(paid.toString());
        txtDate.setText(date.toString());
        txtQuantity.setText(quantity.toString());
        txtPrice.setText(price.toString());
        txtTotal.setText(total.toString());
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jCustomerTableMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        BasicDBObject query = new BasicDBObject();
        query.put("nameCustomer", custDetails.getName());
        query.put("cityCustomer", custDetails.getCity());
        query.put("CnicCustomer", custDetails.getCnic());
        query.put("phoneCustomer", custDetails.getPhone());
        query.put("amount", custDetails.getAmount());
        query.put("paid", custDetails.getPaid());
        query.put("Date", custDetails.getDate());
        query.put("Quantity", custDetails.getQuantity());
        query.put("Price", custDetails.getPrice());
        query.put("Total", custDetails.getTotal());
        
        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("nameCustomer", txtName.getText());
        newDocument.put("cityCustomer", txtCity.getText());
        newDocument.put("CnicCustomer", txtCnic.getText());
        newDocument.put("phoneCustomer", txtPno.getText());
        newDocument.put("amount", custDetails.getAmount());
        newDocument.put("paid", txtPaid.getText());
        newDocument.put("Date", txtDate.getText());
        newDocument.put("Quantity", custDetails.getQuantity());
        newDocument.put("Price", custDetails.getPrice());
        newDocument.put("Total", custDetails.getTotal());
        
        BasicDBObject updateObj = new BasicDBObject();
        updateObj.put("$set",newDocument);
        table.update(query, updateObj);
        LoadData();
        clear();
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int index = jCustomerTable.getSelectedRow();
        Object va = jCustomerTable.getModel().getValueAt(index, 0);
        
        BasicDBObject searchquery = new BasicDBObject();
        searchquery.put("nameCustomer",va.toString());
        table.remove(searchquery);
        
        ((DefaultTableModel)jCustomerTable.getModel()).removeRow(index);
        clear();
        
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            Home h = new Home();
            setVisible(false);
            h.setVisible(true);
            
        
    }catch(Exception pp){
    }//GEN-LAST:event_jButton4ActionPerformed

    }
    private void clear()
    {
        txtName.setText(null);
        txtCity.setText(null);
        txtCnic.setText(null);
        txtPno.setText(null);
        txtAmount.setText(null);
        txtPaid.setText(null);
        txtDate.setText(null);
        txtQuantity.setText(null);
        txtPrice.setText(null);
        txtTotal.setText(null);
    }
    
    private static DBObject creatDBObject(Customerss cust)
    {
        BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
        docBuilder.append("nameCustomer", cust.getName());
        docBuilder.append("cityCustomer", cust.getCity());
        docBuilder.append("CnicCustomer", cust.getCnic());
        docBuilder.append("phoneCustomer", cust.getPhone());
        docBuilder.append("amount", cust.getAmount());
        docBuilder.append("paid", cust.getPaid());
        docBuilder.append("Date", cust.getDate());
        docBuilder.append("Quantity", cust.getQuantity());
        docBuilder.append("Price", cust.getPrice());
        docBuilder.append("Total", cust.getTotal());
        
        return docBuilder.get();
    }        
    
    
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton4;
    private javax.swing.JTable jCustomerTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCnic;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPaid;
    private javax.swing.JTextField txtPno;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void setRowCount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
