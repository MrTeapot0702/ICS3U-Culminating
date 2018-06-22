/*
 * 
 * 
 * 
 */

package Dota2Guide;
import java.util.*;

public class Dota2Guide extends javax.swing.JFrame {
    
    ArrayList <String> bestHeroes = new ArrayList();
    
    
    
    
    public Dota2Guide() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        subTitleLabel = new javax.swing.JLabel();
        moveButton = new javax.swing.JRadioButton();
        attackButton = new javax.swing.JRadioButton();
        spellsButton = new javax.swing.JRadioButton();
        blockCreepsButton = new javax.swing.JRadioButton();
        itemsWorkButton = new javax.swing.JRadioButton();
        runeSpawnButton = new javax.swing.JRadioButton();
        bestHeroesButton = new javax.swing.JRadioButton();
        guideButton = new javax.swing.JButton();
        typeOfHeroesButton = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        finalResult = new javax.swing.JTextArea();
        Image = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        exit = new javax.swing.JMenu();
        exitButton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        titleLabel.setFont(new java.awt.Font("Ebrima", 1, 60)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(204, 0, 0));
        titleLabel.setText("Dota 2 Guide");

        subTitleLabel.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        subTitleLabel.setForeground(new java.awt.Color(204, 0, 0));
        subTitleLabel.setText("Beginner Guide To Dota 2:");

        moveButton.setBackground(new java.awt.Color(0, 0, 0));
        group.add(moveButton);
        moveButton.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        moveButton.setForeground(new java.awt.Color(204, 0, 0));
        moveButton.setText("How To Move:");
        moveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        attackButton.setBackground(new java.awt.Color(0, 0, 0));
        group.add(attackButton);
        attackButton.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        attackButton.setForeground(new java.awt.Color(204, 0, 0));
        attackButton.setText("How To Attack:");

        spellsButton.setBackground(new java.awt.Color(0, 0, 0));
        group.add(spellsButton);
        spellsButton.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        spellsButton.setForeground(new java.awt.Color(204, 0, 0));
        spellsButton.setText("How To Cast Spells:");

        blockCreepsButton.setBackground(new java.awt.Color(0, 0, 0));
        group.add(blockCreepsButton);
        blockCreepsButton.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        blockCreepsButton.setForeground(new java.awt.Color(204, 0, 0));
        blockCreepsButton.setText("How To Block / Pull Creeps:");

        itemsWorkButton.setBackground(new java.awt.Color(0, 0, 0));
        group.add(itemsWorkButton);
        itemsWorkButton.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        itemsWorkButton.setForeground(new java.awt.Color(204, 0, 0));
        itemsWorkButton.setText("How Items Work:");

        runeSpawnButton.setBackground(new java.awt.Color(0, 0, 0));
        group.add(runeSpawnButton);
        runeSpawnButton.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        runeSpawnButton.setForeground(new java.awt.Color(204, 0, 0));
        runeSpawnButton.setText("When Runes Spawn:");

        bestHeroesButton.setBackground(new java.awt.Color(0, 0, 0));
        group.add(bestHeroesButton);
        bestHeroesButton.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        bestHeroesButton.setForeground(new java.awt.Color(204, 0, 0));
        bestHeroesButton.setText("What Heroes Best Suits Beginners:");

        guideButton.setBackground(new java.awt.Color(0, 0, 0));
        guideButton.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        guideButton.setForeground(new java.awt.Color(204, 0, 0));
        guideButton.setText("Guide");
        guideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideButtonActionPerformed(evt);
            }
        });

        typeOfHeroesButton.setBackground(new java.awt.Color(0, 0, 0));
        group.add(typeOfHeroesButton);
        typeOfHeroesButton.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        typeOfHeroesButton.setForeground(new java.awt.Color(204, 0, 0));
        typeOfHeroesButton.setText("What type of Heroes counters what Heroes:");
        typeOfHeroesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOfHeroesButtonActionPerformed(evt);
            }
        });

        finalResult.setEditable(false);
        finalResult.setBackground(new java.awt.Color(0, 0, 0));
        finalResult.setColumns(20);
        finalResult.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        finalResult.setForeground(new java.awt.Color(204, 0, 0));
        finalResult.setRows(5);
        finalResult.setBorder(null);
        jScrollPane2.setViewportView(finalResult);

        Image.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paul Lee\\Downloads\\IMAGES.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(blockCreepsButton)
                            .addComponent(spellsButton)
                            .addComponent(attackButton)
                            .addComponent(moveButton)
                            .addComponent(bestHeroesButton)
                            .addComponent(typeOfHeroesButton)
                            .addComponent(runeSpawnButton)
                            .addComponent(itemsWorkButton)
                            .addComponent(guideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subTitleLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Image)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titleLabel)
                        .addGap(259, 259, 259))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Image)
                        .addGap(18, 18, 18)
                        .addComponent(subTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(moveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(attackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spellsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(blockCreepsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemsWorkButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(runeSpawnButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bestHeroesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(typeOfHeroesButton)
                        .addGap(66, 66, 66)
                        .addComponent(guideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setForeground(new java.awt.Color(204, 0, 0));

        exit.setText("File");

        exitButton.setText("Exit Program");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        exit.add(exitButton);

        jMenuBar1.add(exit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void typeOfHeroesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOfHeroesButtonActionPerformed
        
    }//GEN-LAST:event_typeOfHeroesButtonActionPerformed

    private void guideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideButtonActionPerformed
        
    
         //The if else statement because of the radio button. The if else statement gives the consumer options.
         
         //Every button is set to one text area as my final output.
         
         //Created an Array list for the list of heroes beginners will have an easy time learning.
        
        if (moveButton.isSelected())
        {
            finalResult.setText(" - To move, just right click to a position you want to go to. " + "\n" + "\n" + " - If you want to walk to a specific spot on the map without constantly clicking, then just right click on the mini map on the bottom left of the screen. " 
            + "\n" + "\n" + " - When using a teleportation scroll, instead of scrolling all the way to where you want to go and then left clicking on that specific position, just left click on the mini map and it will start teleporting you there to that specific spot. " + "\n" + "\n"
            + " - When playing a hero/character who can create multiple copies of themself, you can hold the left mouse button and then drag along to get every single one of them. "
            + "\n" + "   To get confirmation you got all of them, you can take a look at the statistics on the bottom middle of the screen and you will see multiple profiles on the character protrait. "
            + "\n" + "   Now that you have control of all of them, they work the exact same as controlling one hero, just left click anywhere you want to head to and they will all start moving, "
            + "\n" + "   but if you want to control only one of them then just press tab and you will move from one character to another and you will only be able to control one of them again, but to get back to controlling all of them just hold your left mouse button and drag."
            );    
        }
        
        else if(attackButton.isSelected())
        {
               finalResult.setText(" - To attack creeps/minions, just right click on them" + "\n" + "\n" + " - To attack enemies, just right click on them."
               + "\n" + "\n" + " - Remember when attacking, just make sure to click on the characters because it will not register as an attack and will register as if you wanted to move to that area. " + "\n" + "\n" 
               + " - There is a more advanced way to attack and it is to press the A button and then right click anywhere, the hero will attack the closest creep to where you right clicked. "
               + "\n" + "\n" + " - One important thing to remember during a Dota 2 game is last hitting");     
        }
        else if(spellsButton.isSelected())
        {
            finalResult.setText( " - There are four types of spells that you must know; target spells, cast spells, passive spells, and ultimates. "
                + "\n" + "   The target spells are spells that can be targeted at a specific player. The cast spells are spells that can be casted and it is not intended for one target, it can affect multiple things like creeps, neutral creeps, and enemies. "
                + "\n" + "   The passive spells are spells that can not be casted, but improve the hero in other ways like being able to regenerate mana faster, having evasion, reflecting some of the damage done to you to the enemy who hit you, being able to reduce the enemy's vision during the night, and much more. " 
                + "\n" + "\n" + " - There are four buttons that are extremely important to remember because they will make or break anyone's game. These four buttons are Q, W, E, and R. "
                + "\n" + "   Q is usually a target spell where you would press Q and then left click on an enemy or a creep. It could also be a cast spell where you can cast it without targeting someone. W can be either a cast spell, a target spell, or a passive spell. E is usually a passive. "
                + "\n" + "   R is the final spell or also known as a ultimate, the ultimate is the strongest spell in any hero. The ultimate can either be a cast spell, a passive, or both combined. This does not mean to just run around and cast your ultimate on anything because it can turn the game around and it has the longest cooldown."
                + "\n" + "   If the hero's ultimate is a passive there is nothing to worry about, but if you have to cast it, then always use it when it is the most reliable and when you are sure that the game will turn around after you cast it. "
                + "\n" + "\n" + " - If you were in the middle of a casting a spell, but you wanted to cancel it then just press S. S is the button for cancelling actions. "
                + "\n" + "\n" + " - Remember, that if you are against an enemy who cast a spell that stuns you be careful."
                + "\n" + "   If you are in the middle of casting a spell, an enemy can cast that stunning spell and it will automatically cancel your spell.");
        }
        else if(blockCreepsButton.isSelected())
        {
            finalResult.setText(" - Blocking creeps is the most important factor to successful farming in Dota because blocking creeps will mean that the enemy's creeps will be on your side of the lane which then you can safely farm without worrying about being harassed."
            + "\n" + "\n" + " - The instant the game starts, the creeps spawn so just move in front of them and then start blocking their path. In addition, while blocking their path, press your cancel button or S as default to cancel your movement and you will block them for even longer periods of time. "
            + "\n" + "\n" + " - There are two methods of pulling creeps. First method is to get in the creeps vision when they are not attacking anyone and they will start chasing you. The second method to pulling creeps is to attack an enemy and the creeps will start chasing you, but the instant you stop attacking and start running, "
            + "\n" + "    they will start attacking what is closest to them."
            );
        }
        else if(itemsWorkButton.isSelected())
        {
         finalResult.setText(" - Items in game are extremely important because items are the only way for your hero to get strong."
         + "\n" + "\n" + " - Items have many purposes like giving the player extra attack speed, evasion, extra damage, more health, more mana, more health or mana regeneration, and much more."
         + "\n" + "\n" + " - If your hero is a tank then items that give more health and health regeneration are suggested."
         + "\n" + "\n" + " - If your hero is a support then items that can regenerate the teams health and give them extra vision by placing wards are suggested. "
         + "\n" + "\n" + " - If your hero is a carry then items that output a lot of damage and can help them survive during fights are suggested."        
         + "\n" + "\n" + " - There are two types of wards, the sentry ward which reveals invisible heroes or wards, the observer ward which gives the team more vision by lighting up the area and that will show enemy heroes if they are coming to gank and they run under the lit area or show recently spawned runes. Wards are the most important item for giving the team vision, but carries rarely buy them and supports are expected to buy them."
         + "\n" + "\n" + " - There is an item called, ''Bottle'' that regenerates a bit of health and mana. The bottle has 3 charges and once you use all of your charges, you can head back or teleport back to the Fountain / Base.  ");   
        }
        else if(runeSpawnButton.isSelected())
        {
         finalResult.setText(" - There are two types of runes. Bounty runes that gives the entire team an extra set of gold / coin. Runes that boost a specific part of the character like doubling damage, reducing mana cost, giving full regeneration, and granting a player invisibility. "
         + "\n" + "\n" + " - Bounty runes spawn every five minutes and anyone can go collect it because the whole team will benefit from it. In addition, the Bounty runes spawn at the very start of the game. It is possible to steal the enemy's rune, but it is also possible for the enemies to steal your runes."
         + "\n" + "   Just remember if the whole enemy team is coming for the rune and you are by yourself then do not fight for it because it could cost you your life. "
         + "\n" + "\n" + " - Boosting runes spawn every two minutes and do not spawn when the game starts. Boosting runes are extremely important for mid players as they spawn right outside of mid lane. "
         + "\n" + "   If they have a boosting rune like double damage then it could change the game around because they have an easier chance of killing you which results in them getting extra experience and gold and they have the lane to themself which gives them free farm. "
         + "\n" + "\n" + " - Runes recharge bottles so when a new rune spawns, just make sure to use all of your charges before you pick it up. With a bottle, you will be able to keep your rune and use it whenever you want to."
         + "\n" + "   Although when a rune is in your bottle there is a time limit of 2 minutes. After 2 minutes, the bottled rune will be automatically activated. ");   
        }
        else if(bestHeroesButton.isSelected())
        {
            Collections.addAll(bestHeroes, " For Melee Heroes " + "\n" + "\n" + " - Abaddon " + "\n" + "\n" + " - Axe " + "\n" + "\n" + " - Bloodseeker " + "\n" + "\n" + " - Bounty Hunter "
            + "\n" + "\n" + " - Bristleback " + "\n" + "\n" + " - Chaos Knight " + "\n" + "\n" + " - Dragon Knight " + "\n" + "\n" + " - Faceless Void " + "\n" + "\n" + " - Juggernaut "
            + "\n" + "\n" + " - Legion Commander" + "\n" + "\n" + " - Lifestealer " + "\n" + "\n" + " - Lycan " + "\n" + "\n" + " - Monkey King " + "\n" + "\n" + " - Night Stalker "
            + "\n" + "\n" + " - Ogre Magi " + "\n" + "\n" + " - Pangolier " + "\n" + "\n" + " - Phantom Lancer " + "\n" + "\n" + " - Riki " + "\n" + "\n" + " - Slark " + "\n" + "\n"
            + " - Sven " + "\n" + "\n" + " - Tusk " + "\n" + "\n" + " - Ursa " + "\n" + "\n" + " - Wraith King " + "\n" + "\n" + " For Ranged Heroes " + "\n" + "\n"
            + " - Bane " + "\n" + "\n" + " - Clinkz " + "\n" + "\n" + " - Crystal Maiden " + "\n" + "\n" + " - Dazzle " + "\n" + "\n" + " - Drow ranger " + "\n" + "\n"
            + " - Enigma " + "\n" + "\n" + " - Huskar " + "\n" + "\n" + " - Lich " + "\n" + "\n" + " - Lina " + "\n" + "\n" + " - Lion " + "\n" + "\n" + " - Luna " 
            + "\n" + "\n" + " - Mirana " + "\n" + "\n" + " - Queen Of Pain " + "\n" + "\n" + " - Razor " + "\n" + "\n" + " - Shadow Shaman " + "\n" + "\n" + " - Sniper "
            + "\n" + "\n" + " - Vengeful Spirit" + "\n" +"\n" + " - Venomancer " + "\n" + "\n" + " - Viper " + "\n" + "\n" + " - Windranger " + "\n" + "\n" + " - Witch Doctor "
            + "\n" + "\n" + " - Zeus ");
            
            finalResult.setText(" Easy Heroes For Beginners " + "\n" + "\n" + bestHeroes);
        }
        else if(typeOfHeroesButton.isSelected())
        {
              finalResult.setText(" - There are three types of heroes; Agility, Strength, and Intelligence." + "\n" + "\n" + " - Agility heroes are either supports or hard carries because they specialize in agility. Heroes under agility are most likely going to be the hardest carry like Phantom Assassin and Bloodseeker. "
              + "\n" + "\n" + " - Strength heroes are either supports, tanks, and tanky supports. Heroes under strength are most likely tanks like Axe, and Bristleback, but there are also tanky carries like Legion Commander, and Alchemist. In addition, there are a few supports like Phoenix under strength."
              + "\n" + "\n" + " - Intelligence heroes are either supports or nukers (Carries who are weak but deal a lot of damage.). Supports for intelligence are heroes like Shadow Shaman and nukers are like Lina, and Invoker. "
              + "\n" + "\n" + " - Strength heroes that are tanks usually counter heroes under intelligence like Lina and Invoker because they have so much health that even when they have a lot of damage, they can tank it. Intelligence heroes usually counter agility heroes because agility heroes can tank a little bit of normal attacks, but they struggle against spells and nukers are mostly spells."
              + "\n" + "   Agility heroes counter strength heroes because heroes like Ursa, Drow Ranger, and Viper are made for tanks. They can rip through tanks like a piece of paper. Ursa is the best for tanks because one of his skills can increase the damage per hit on any hero and tanks can only take so many hits before dying. "
              + "\n" + "\n" + " - One advice for beginners is to pick heroes under strength and agility because heroes that are easy to learn are mostly from agility and strength. Intelligence does require a little more skill because they do not do normal attacks, but use spells. That means, you must know when to use those spells and what they do, but once you master heroes under intelligence like Invoker, it becomes very satisfying to play them. ");      
        }
            
    }//GEN-LAST:event_guideButtonActionPerformed

    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtonActionPerformed
       
    }//GEN-LAST:event_moveButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Dota2Guide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dota2Guide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dota2Guide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dota2Guide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dota2Guide().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JRadioButton attackButton;
    private javax.swing.JRadioButton bestHeroesButton;
    private javax.swing.JRadioButton blockCreepsButton;
    private javax.swing.JMenu exit;
    private javax.swing.JMenuItem exitButton;
    private javax.swing.JTextArea finalResult;
    private javax.swing.ButtonGroup group;
    private javax.swing.JButton guideButton;
    private javax.swing.JRadioButton itemsWorkButton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton moveButton;
    private javax.swing.JRadioButton runeSpawnButton;
    private javax.swing.JRadioButton spellsButton;
    private javax.swing.JLabel subTitleLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JRadioButton typeOfHeroesButton;
    // End of variables declaration//GEN-END:variables
}
