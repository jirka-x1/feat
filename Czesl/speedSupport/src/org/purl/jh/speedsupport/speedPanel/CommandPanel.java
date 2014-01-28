package org.purl.jh.speedsupport.speedPanel;

import java.util.List;
import javax.swing.JComboBox;
import org.purl.jh.util.col.Mapper;
import org.purl.jh.feat.util0.XComboBox;

/**
 *
 * @author j
 */
public class CommandPanel extends javax.swing.JPanel {

    private final List<Command> commands;

    /** Creates new form CommandPanel */
    public CommandPanel(List<Command> commands, Command aCommand, String aComment) {
        this.commands = commands;
        initComponents();

        if (aCommand != null) {
            ((XComboBox<Command>)cmdCombo).setCurItem(aCommand);
        }
        else if (commands.size() > 0) {
            cmdCombo.setSelectedIndex(0);
        }

        commentText.setText(aComment);
    }

    private JComboBox createComboBox() {
        return new XComboBox<Command>(commands, new Mapper<Command,String>() {

            @Override
            public String map(Command aOrigItem) {
                return aOrigItem.getTitle();
            }

        });
    }

    public Command getCommand() {
        return ((XComboBox<Command>)cmdCombo).getCurItem();
    }

    public String getComment() {
        return commentText.getText();
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdLabel = new javax.swing.JLabel();
        cmdCombo = createComboBox();
        commentLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentText = new javax.swing.JTextArea();

        cmdLabel.setText(org.openide.util.NbBundle.getMessage(CommandPanel.class, "CommandPanel.cmdLabel.text")); // NOI18N

        commentLabel.setText(org.openide.util.NbBundle.getMessage(CommandPanel.class, "CommandPanel.commentLabel.text")); // NOI18N

        commentText.setColumns(20);
        commentText.setRows(5);
        jScrollPane1.setViewportView(commentText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(commentLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(cmdCombo, 0, 263, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdLabel)
                    .addComponent(cmdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(commentLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmdCombo;
    private javax.swing.JLabel cmdLabel;
    private javax.swing.JLabel commentLabel;
    private javax.swing.JTextArea commentText;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
