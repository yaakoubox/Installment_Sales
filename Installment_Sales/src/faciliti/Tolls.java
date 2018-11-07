package faciliti;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
//import sun.swing.table.DefaultTableCellHeaderRenderer;

public class Tolls {

    public static void MsgBox(Object obj, String Title_of_yourmessage) {
        JOptionPane.showMessageDialog(null, obj, Title_of_yourmessage, JOptionPane.INFORMATION_MESSAGE, null);
    }

    public static void OpenFormWithBigSize(JFrame form, String title) {
        //form.setSize(1366, 768 );
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        form.setResizable(false);
        System.out.println(dim.width+"/"+dim.height);
        form.setSize(dim.width, dim.height );
        form.setLocationRelativeTo(null);
        form.setTitle(title);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }

    public static void OpenForm(JFrame form, String title) {
        form.setResizable(false);
        form.setTitle(title);
        form.setLocationRelativeTo(null);//
        form.setDefaultCloseOperation(2);//
        form.setVisible(true);

    }

    public static boolean ConfigMsg(String text) {
        int test = JOptionPane.showConfirmDialog(null, text);
        if (test == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }

    public static void ClearText(Container form) {
        for (Component c : form.getComponents()) {
            if (c instanceof JTextField) {
                JTextField txt = (JTextField) c;
                txt.setText("");
            } else if (c instanceof Container) {
                ClearText((Container) c);
            }
        }
    }

    public static void PrintRapoorts(JTable table, String TitleOfTheRaport) {

        try {
            MessageFormat header = new MessageFormat("تقرير " + TitleOfTheRaport);
            MessageFormat footer = new MessageFormat("الصفحة - {0}");
            table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(Tolls.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void TableColor(JTable table) {
        table.getTableHeader().setBackground(new java.awt.Color(0, 0, 100));
        table.getTableHeader().setForeground(Color.WHITE);
    }

    public static void TableArabic(JTable table) {
        DefaultTableCellRenderer RightRenderer = new DefaultTableCellRenderer();
        RightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        for (int i = 0; i < table.getColumnCount(); i++) {

            table.getColumnModel().getColumn(i).setCellRenderer(RightRenderer);
        }
    }

    public static void drawRect(JFrame form, Color c, int large) {

        /*    JPanel pnl = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(c);
                g2.setStroke(new BasicStroke(large));
                g2.drawRect(10, form.getHeight(), form.getWidth(), form.getHeight());
            }
        };
        form.add(pnl);
        form.setBounds(0, 0, form.getWidth(), form.getHeight());

    }*/
        JPanel pnl = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(c);
                g2.setStroke(new BasicStroke(large));
                g2.drawRect(0, 0, form.getWidth(), form.getHeight());
                //g2.drawRect(0, form.getHeight(), form.getWidth(), form.getHeight());
            }
        };
        form.add(pnl);
        pnl.setBounds(0, 0, form.getWidth(), form.getHeight());

    }
    
    public static void MakeTrans(Container form){
         for (Component c : form.getComponents()) {
            if (c instanceof JButton) {
                JButton btn = (JButton) c;
                btn.setBorderPainted(false);
                btn.setFocusPainted(false);
            } else if (c instanceof Container) {
                MakeTrans((Container) c);
            }
        }
    
    }
    
      public static void DrawImage(int x, int y, String path, JFrame form) {
            JPanel pnl = new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    Graphics2D g2 = (Graphics2D) g;
                    File FileImage = new File(path);
                    try {
                        Image img = ImageIO.read(FileImage);
                        g2.drawImage(img, x, y, form);
                    } catch (IOException ex) {
                        Tolls.MsgBox(ex.getMessage(), "hello");
                    }
                }
            };
            form.add(pnl);
            pnl.setBounds(0, 0, form.getWidth(), form.getHeight());
        }

}
