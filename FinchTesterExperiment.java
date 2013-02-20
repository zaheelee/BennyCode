package Code;
// Needs a package declaration to move to another folder

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

import java.awt.Color;

/**
 * I am messing with the FinchTester class until I know how all of the components
 * work.  I will leave my own comments and change things to see what happens.  
 * If major errors occur, look at FinchTester code and find differences.  
 * @author Jessie Adkins
 */

public class FinchTesterExperiment extends javax.swing.JFrame{
  
  Finch benny;
  /** Creates new form FinchTester */
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  // Instance Fields
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton13;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton7;
  private javax.swing.JButton jButton9;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea jTextArea1;
  private java.awt.Label label1;
  // End of variables declaration//GEN-END:variables
  
  //AKA a constructor
  public FinchTesterExperiment() {
    initComponents();
    benny = new Finch();
  }
  
  
  /** This method is called from within the constructor to
    * initialize the form and all of the components.
    * WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
  
  //compiler directive, not really code, just tells Java not to show warnings
  //try not to use this
  //@SuppressWarnings("unchecked")
  
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  //^^^^^^ ???????
  private void initComponents() {
    
    //look up javax.swing when the wifi gets fixed
    jButton1 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jButton7 = new javax.swing.JButton();
    jButton9 = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTextArea1 = new javax.swing.JTextArea();
    label1 = new java.awt.Label();
    jButton13 = new javax.swing.JButton();
    
    //closes when you press the red "x" in the corner
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    
    //initializes all of the different components of jButton1
    //such as color, font, and what happens when you click
    jButton1.setBackground(java.awt.Color.green);
    jButton1.setFont(new java.awt.Font("Tahoma", 1, 12));
    jButton1.setText("Hello, World!");
    //a small method is contained within the parameters of the addActionListener()
    //not reccomended, but in this case it is not too bad
    //all of this craziness is because this is a way around importing things
    //basically shows exact location for the declaration of the variable "evt"
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });
    
    //these all act in the same way ast all of the jButton1 things
    jButton3.setBackground(java.awt.Color.green);
    jButton3.setFont(new java.awt.Font("Tahoma", 1, 12));
    jButton3.setText("Polite Roaming");
    jTextArea1.setText("Polite Roaming: flip over to turn off.");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });
    
    //same as jButton1
    jButton7.setBackground(java.awt.Color.green);
    jButton7.setFont(new java.awt.Font("Tahoma", 1, 12));
    jButton7.setText("Test Sensors");
    jButton7.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton7ActionPerformed(evt);
      }
    });
    
    //same as jButton1
    jButton9.setBackground(java.awt.Color.green);
    jButton9.setFont(new java.awt.Font("Tahoma", 1, 12));
    jButton9.setText("Test IR");
    jButton9.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton9ActionPerformed(evt);
      }
    });
    
    //?
    jTextArea1.setColumns(20);
    jTextArea1.setRows(5);
    jScrollPane1.setViewportView(jTextArea1);
    
    //?
    label1.setAlignment(java.awt.Label.CENTER);
    label1.setFont(new java.awt.Font("Dialog", 0, 18));
    label1.setText("Finch Testing Program");
    
    //I think this is the same as jButton1, but I don't know why it is 
    //seperate from the other buttons.  Usually the seperation means 
    //something in this code.  Check this out more later.
    jButton13.setBackground(new java.awt.Color(51, 255, 51));
    jButton13.setFont(new java.awt.Font("Tahoma", 1, 12));
    jButton13.setText("Test LED");
    jButton13.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton13ActionPerformed(evt);
      }
    });
    
    
    //I think it just deals with the sizing and placement of things
    //ignore for now, I don't think it's that important
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                    .addGap(68, 68, 68)
                                                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                    .addContainerGap()
                                                                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                    .addContainerGap()
                                                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                    .addContainerGap()
                                                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                    .addContainerGap()
                                                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                    .addContainerGap()
                                                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                    .addContainerGap()
                                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)))
                                            .addContainerGap())
                             );
    layout.setVerticalGroup(
                            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                          .addContainerGap()
                                          .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGap(23, 23, 23)
                                          .addComponent(jButton13)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(jButton1)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(jButton3)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(jButton7)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(jButton9)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGap(69, 69, 69))
                           );
    
    pack();
  }
  
// </editor-fold>//GEN-END:initComponents
  // Benny says Hello using computer speakers. Make sure they are on!
  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    //spelled wrong on purpose. Apparently, Benny can't pronounce things properly
    benny.saySomething("Hello, Wourld! My name is Benny!", 4000);
    jTextArea1.setText("Benny is saying Hello to the World!");
  }
  
//GEN-LAST:event_jButton1ActionPerformed
  //Benny roams around and stops if he is about to bump in to things
  //he then says he's sorry, turns in some random direction, and drives away
  //stopped if turned upside down
  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    //jTextArea1.setText("Benny is politely exploring the world! Flip him over to turn him off.");
    while(true){
      if(benny.isObstacle() == false && benny.isFinchUpsideDown() == false){
        benny.setLED(0, 255, 0);
        benny.setWheelVelocities(255, 255);
      }else if(benny.isObstacle() == true && benny.isFinchUpsideDown() == false){
        benny.stopWheels();
        benny.setLED(255, 0, 0);
        benny.saySomething("Excuse me", 1000);
        benny.setWheelVelocities(-155, -155, 2000);
        int randomLeft = (int)(Math.random() * 255);
        int randomRight = (int)(Math.random() * 255);
        benny.setWheelVelocities(randomLeft, randomRight, 1000);
        benny.setWheelVelocities(255, 255);
      }else {
        benny.setWheelVelocities(0,0);
        break;
      }
    }
  }
  
//GEN-LAST:event_jButton3ActionPerformed
  // Makes sure light and temperature sensors are within range (a value of 0 or 255 would indicate a shorted wire.  Also checks accelerometers
  private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    jTextArea1.setText("Testing sensors...\n");
    boolean sensorWorks = true;
    if(benny.getLeftLightSensor() > 0 && benny.getLeftLightSensor() < 255 && benny.getRightLightSensor() > 0 && benny.getRightLightSensor() < 255) {
      jTextArea1.append("Light sensors working\n");
    }
    else {
      sensorWorks = false;
      jTextArea1.append("Light sensors FAILED\n");
    }
    if(benny.getTemperature() > 10 && benny.getTemperature() < 35) {
      jTextArea1.append("Temperature sensor working\n");
    }
    else {
      sensorWorks = false;
      jTextArea1.append("Temperature sensor FAILED\n");
    }
    double[] accels = new double[3];
    accels = benny.getAccelerations();
    if(accels[0] < 1.5 && accels[0] > -1.5 && accels[1] < 1.5 && accels[1] > -1.5 && accels[2] < 1.5 && accels[2] > -1.5) {
      jTextArea1.append("Accelerometer working\n");
    }
    else {
      sensorWorks = false;
      jTextArea1.append("Accelerometer FAILED\n");
    }
    if(sensorWorks){
      benny.setLED(0,255,0);
    }
  }
  
//GEN-LAST:event_jButton7ActionPerformed
  // Checks if the obstacle sensors work using the LED to provide feedback 
  // can be stopped by pointing the beak down at the ground
  private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    
    boolean leftIR, rightIR;
    while(!benny.isBeakDown()) {
      //    jTextArea1.setText("Testing IR Obstacle sensor.\n");
      //    jTextArea1.append("LED will turn green for left obstacle\n");
      //    jTextArea1.append("blue for right obstacle\n");
      //    jTextArea1.append("red for both obstacles\n");
      //    jTextArea1.append("Exit this test by pointing the beak down");
      
      leftIR = benny.isObstacleLeftSide();
      rightIR = benny.isObstacleRightSide();
      if(leftIR && rightIR) {
        benny.setLED(255,0,0);
      }
      else if(leftIR) {
        benny.setLED(0, 255, 0);
      }
      else if(rightIR) {
        benny.setLED(0,0,255);
      }
      else {
        benny.setLED(0,0,0);
      }
    }
    benny.setLED(0,0,0);
    
  }
  
//GEN-LAST:event_jButton9ActionPerformed
  // Tests the LED's three color elements (red, green, blue)
  private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
    benny.setLED(255,0,0);
    benny.sleep(1000);
    benny.setLED(0,255,0);
    benny.sleep(1000);
    benny.setLED(0,0,255);
    benny.sleep(1000);
    benny.setLED(0,0,0);
    jTextArea1.setText("The LED should have changed from red \n to green to blue.");
  }
  
//GEN-LAST:event_jButton13ActionPerformed
  
  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FinchTesterExperiment().setVisible(true);
      }
    });
  }
  
}