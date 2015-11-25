package karmap.gui;

import static karmap.gui.AppBackBone.solveByMapBackBone;
import static karmap.gui.AppBackBone.solveByInputBackBone;
import static karmap.gui.AppBackBone.toggle;
import javax.swing.JButton;

public class StartApp extends javax.swing.JFrame {
    private JButton[] getButtons() {
        JButton[] list = new JButton[16];
        
        list[0] = bt4x40000;
        list[1] = bt4x40001;
        list[2] = bt4x40010;
        list[3] = bt4x40011;
        list[4] = bt4x40100;
        list[5] = bt4x40101;
        list[6] = bt4x40110;
        list[7] = bt4x40111;
        list[8] = bt4x41000;
        list[9] = bt4x41001;
        list[10] = bt4x41010;
        list[11] = bt4x41011;
        list[12] = bt4x41100;
        list[13] = bt4x41101;
        list[14] = bt4x41110;
        list[15] = bt4x41111;
        
        return list;
    }
    
    private void solve4x4BackBone() {
        lbResult.setText(solveByMapBackBone(getButtons()));
    }
    
    public StartApp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        p4Vars = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        p4x4table = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        bt4x40000 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        bt4x40001 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        bt4x40010 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        bt4x40011 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        bt4x40100 = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        bt4x40101 = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        bt4x40110 = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        bt4x40111 = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        bt4x41000 = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        bt4x41001 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        bt4x41010 = new javax.swing.JButton();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        bt4x41011 = new javax.swing.JButton();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        bt4x41100 = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        bt4x41101 = new javax.swing.JButton();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        bt4x41110 = new javax.swing.JButton();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        bt4x41111 = new javax.swing.JButton();
        jLabel112 = new javax.swing.JLabel();
        p4x4kmap = new javax.swing.JPanel();
        jLabel128 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        b4x40000 = new javax.swing.JButton();
        b4x40100 = new javax.swing.JButton();
        b4x41100 = new javax.swing.JButton();
        b4x41000 = new javax.swing.JButton();
        jLabel133 = new javax.swing.JLabel();
        b4x40001 = new javax.swing.JButton();
        b4x40101 = new javax.swing.JButton();
        b4x41101 = new javax.swing.JButton();
        b4x41001 = new javax.swing.JButton();
        jLabel134 = new javax.swing.JLabel();
        b4x40011 = new javax.swing.JButton();
        b4x40111 = new javax.swing.JButton();
        b4x41111 = new javax.swing.JButton();
        b4x41011 = new javax.swing.JButton();
        jLabel135 = new javax.swing.JLabel();
        b4x40010 = new javax.swing.JButton();
        b4x40110 = new javax.swing.JButton();
        b4x41110 = new javax.swing.JButton();
        b4x41010 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btReset = new javax.swing.JButton();
        btClose1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbResult = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel139 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taInput = new javax.swing.JTextArea();
        jLabel140 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taOutput = new javax.swing.JTextArea();
        btExec = new javax.swing.JButton();
        btClean = new javax.swing.JButton();
        btClose2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Karma - Karnaugh Map Optimizer");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 803, 605));
        setMinimumSize(new java.awt.Dimension(803, 605));
        setResizable(false);
        setSize(new java.awt.Dimension(880, 579));

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(100, 100));
        jTabbedPane1.setName(""); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(32767, 32767));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Tabela Verdade");

        p4x4table.setLayout(new java.awt.GridLayout(17, 5, 2, 2));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("A");
        p4x4table.add(jLabel2);

        jLabel44.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("B");
        p4x4table.add(jLabel44);

        jLabel45.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("C");
        p4x4table.add(jLabel45);

        jLabel46.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("D");
        p4x4table.add(jLabel46);

        jLabel47.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("f(A, B, C, D)");
        p4x4table.add(jLabel47);

        jLabel48.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("0");
        p4x4table.add(jLabel48);

        jLabel49.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("0");
        p4x4table.add(jLabel49);

        jLabel50.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("0");
        p4x4table.add(jLabel50);

        jLabel51.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("0");
        p4x4table.add(jLabel51);

        bt4x40000.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt4x40000.setText("0");
        bt4x40000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4x40000ActionPerformed(evt);
            }
        });
        p4x4table.add(bt4x40000);

        jLabel52.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("0");
        p4x4table.add(jLabel52);

        jLabel53.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("0");
        p4x4table.add(jLabel53);

        jLabel54.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("0");
        p4x4table.add(jLabel54);

        jLabel55.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("1");
        p4x4table.add(jLabel55);

        bt4x40001.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt4x40001.setText("0");
        bt4x40001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4x40001ActionPerformed(evt);
            }
        });
        p4x4table.add(bt4x40001);

        jLabel56.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("0");
        p4x4table.add(jLabel56);

        jLabel57.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("0");
        p4x4table.add(jLabel57);

        jLabel58.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("1");
        p4x4table.add(jLabel58);

        jLabel59.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("0");
        p4x4table.add(jLabel59);

        bt4x40010.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt4x40010.setText("0");
        bt4x40010.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4x40010ActionPerformed(evt);
            }
        });
        p4x4table.add(bt4x40010);

        jLabel60.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("0");
        p4x4table.add(jLabel60);

        jLabel61.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("0");
        p4x4table.add(jLabel61);

        jLabel62.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("1");
        p4x4table.add(jLabel62);

        jLabel63.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("1");
        p4x4table.add(jLabel63);

        bt4x40011.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt4x40011.setText("0");
        bt4x40011.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4x40011ActionPerformed(evt);
            }
        });
        p4x4table.add(bt4x40011);

        jLabel64.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("0");
        p4x4table.add(jLabel64);

        jLabel65.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("1");
        p4x4table.add(jLabel65);

        jLabel66.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("0");
        p4x4table.add(jLabel66);

        jLabel67.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("0");
        p4x4table.add(jLabel67);

        bt4x40100.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt4x40100.setText("0");
        bt4x40100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4x40100ActionPerformed(evt);
            }
        });
        p4x4table.add(bt4x40100);

        jLabel68.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("0");
        p4x4table.add(jLabel68);

        jLabel69.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("1");
        p4x4table.add(jLabel69);

        jLabel70.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("0");
        p4x4table.add(jLabel70);

        jLabel71.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("1");
        p4x4table.add(jLabel71);

        bt4x40101.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt4x40101.setText("0");
        bt4x40101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4x40101ActionPerformed(evt);
            }
        });
        p4x4table.add(bt4x40101);

        jLabel72.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("0");
        p4x4table.add(jLabel72);

        jLabel73.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("1");
        p4x4table.add(jLabel73);

        jLabel74.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("1");
        p4x4table.add(jLabel74);

        jLabel75.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("0");
        p4x4table.add(jLabel75);

        bt4x40110.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt4x40110.setText("0");
        bt4x40110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4x40110ActionPerformed(evt);
            }
        });
        p4x4table.add(bt4x40110);

        jLabel76.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("0");
        p4x4table.add(jLabel76);

        jLabel77.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("1");
        p4x4table.add(jLabel77);

        jLabel78.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("1");
        p4x4table.add(jLabel78);

        jLabel79.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("1");
        p4x4table.add(jLabel79);

        bt4x40111.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt4x40111.setText("0");
        bt4x40111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4x40111ActionPerformed(evt);
            }
        });
        p4x4table.add(bt4x40111);

        jLabel80.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("1");
        p4x4table.add(jLabel80);

        jLabel81.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("0");
        p4x4table.add(jLabel81);

        jLabel82.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("0");
        p4x4table.add(jLabel82);

        jLabel83.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("0");
        p4x4table.add(jLabel83);

        bt4x41000.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt4x41000.setText("0");
        bt4x41000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4x41000ActionPerformed(evt);
            }
        });
        p4x4table.add(bt4x41000);

        jLabel84.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("1");
        p4x4table.add(jLabel84);

        jLabel85.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("0");
        p4x4table.add(jLabel85);

        jLabel86.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("0");
        p4x4table.add(jLabel86);

        jLabel87.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("1");
        p4x4table.add(jLabel87);

        bt4x41001.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt4x41001.setText("0");
        bt4x41001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4x41001ActionPerformed(evt);
            }
        });
        p4x4table.add(bt4x41001);

        jLabel88.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("1");
        p4x4table.add(jLabel88);

        jLabel89.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("0");
        p4x4table.add(jLabel89);

        jLabel90.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("1");
        p4x4table.add(jLabel90);

        jLabel91.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("0");
        p4x4table.add(jLabel91);

        bt4x41010.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt4x41010.setText("0");
        bt4x41010.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4x41010ActionPerformed(evt);
            }
        });
        p4x4table.add(bt4x41010);

        jLabel92.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("1");
        p4x4table.add(jLabel92);

        jLabel93.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("0");
        p4x4table.add(jLabel93);

        jLabel94.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("1");
        p4x4table.add(jLabel94);

        jLabel95.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("1");
        p4x4table.add(jLabel95);

        bt4x41011.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt4x41011.setText("0");
        bt4x41011.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4x41011ActionPerformed(evt);
            }
        });
        p4x4table.add(bt4x41011);

        jLabel96.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("1");
        p4x4table.add(jLabel96);

        jLabel97.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("1");
        p4x4table.add(jLabel97);

        jLabel98.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("0");
        p4x4table.add(jLabel98);

        jLabel99.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("0");
        p4x4table.add(jLabel99);

        bt4x41100.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt4x41100.setText("0");
        bt4x41100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4x41100ActionPerformed(evt);
            }
        });
        p4x4table.add(bt4x41100);

        jLabel100.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("1");
        p4x4table.add(jLabel100);

        jLabel101.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("1");
        p4x4table.add(jLabel101);

        jLabel102.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("0");
        p4x4table.add(jLabel102);

        jLabel103.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("1");
        p4x4table.add(jLabel103);

        bt4x41101.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt4x41101.setText("0");
        bt4x41101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4x41101ActionPerformed(evt);
            }
        });
        p4x4table.add(bt4x41101);

        jLabel104.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setText("1");
        p4x4table.add(jLabel104);

        jLabel105.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("1");
        p4x4table.add(jLabel105);

        jLabel106.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("1");
        p4x4table.add(jLabel106);

        jLabel107.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("0");
        p4x4table.add(jLabel107);

        bt4x41110.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt4x41110.setText("0");
        bt4x41110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4x41110ActionPerformed(evt);
            }
        });
        p4x4table.add(bt4x41110);

        jLabel108.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("1");
        p4x4table.add(jLabel108);

        jLabel109.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setText("1");
        p4x4table.add(jLabel109);

        jLabel110.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setText("1");
        p4x4table.add(jLabel110);

        jLabel111.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("1");
        p4x4table.add(jLabel111);

        bt4x41111.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt4x41111.setText("0");
        bt4x41111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4x41111ActionPerformed(evt);
            }
        });
        p4x4table.add(bt4x41111);

        jLabel112.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel112.setText("Mapa de Karnaugh");

        p4x4kmap.setLayout(new java.awt.GridLayout(5, 5, 2, 2));

        jLabel128.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p4x4kmap.add(jLabel128);

        jLabel127.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel127.setText("A'B'");
        p4x4kmap.add(jLabel127);

        jLabel129.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel129.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel129.setText("A'B");
        p4x4kmap.add(jLabel129);

        jLabel130.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel130.setText("AB");
        p4x4kmap.add(jLabel130);

        jLabel131.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setText("AB'");
        p4x4kmap.add(jLabel131);

        jLabel132.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel132.setText("C'D'");
        p4x4kmap.add(jLabel132);

        b4x40000.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b4x40000.setText("0");
        b4x40000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4x40000ActionPerformed(evt);
            }
        });
        p4x4kmap.add(b4x40000);

        b4x40100.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b4x40100.setText("0");
        b4x40100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4x40100ActionPerformed(evt);
            }
        });
        p4x4kmap.add(b4x40100);

        b4x41100.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b4x41100.setText("0");
        b4x41100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4x41100ActionPerformed(evt);
            }
        });
        p4x4kmap.add(b4x41100);

        b4x41000.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b4x41000.setText("0");
        b4x41000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4x41000ActionPerformed(evt);
            }
        });
        p4x4kmap.add(b4x41000);

        jLabel133.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel133.setText("C'D");
        p4x4kmap.add(jLabel133);

        b4x40001.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b4x40001.setText("0");
        b4x40001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4x40001ActionPerformed(evt);
            }
        });
        p4x4kmap.add(b4x40001);

        b4x40101.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b4x40101.setText("0");
        b4x40101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4x40101ActionPerformed(evt);
            }
        });
        p4x4kmap.add(b4x40101);

        b4x41101.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b4x41101.setText("0");
        b4x41101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4x41101ActionPerformed(evt);
            }
        });
        p4x4kmap.add(b4x41101);

        b4x41001.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b4x41001.setText("0");
        b4x41001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4x41001ActionPerformed(evt);
            }
        });
        p4x4kmap.add(b4x41001);

        jLabel134.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel134.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel134.setText("CD");
        p4x4kmap.add(jLabel134);

        b4x40011.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b4x40011.setText("0");
        b4x40011.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4x40011ActionPerformed(evt);
            }
        });
        p4x4kmap.add(b4x40011);

        b4x40111.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b4x40111.setText("0");
        b4x40111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4x40111ActionPerformed(evt);
            }
        });
        p4x4kmap.add(b4x40111);

        b4x41111.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b4x41111.setText("0");
        b4x41111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4x41111ActionPerformed(evt);
            }
        });
        p4x4kmap.add(b4x41111);

        b4x41011.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b4x41011.setText("0");
        b4x41011.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4x41011ActionPerformed(evt);
            }
        });
        p4x4kmap.add(b4x41011);

        jLabel135.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel135.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel135.setText("CD'");
        p4x4kmap.add(jLabel135);

        b4x40010.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b4x40010.setText("0");
        b4x40010.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4x40010ActionPerformed(evt);
            }
        });
        p4x4kmap.add(b4x40010);

        b4x40110.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b4x40110.setText("0");
        b4x40110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4x40110ActionPerformed(evt);
            }
        });
        p4x4kmap.add(b4x40110);

        b4x41110.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b4x41110.setText("0");
        b4x41110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4x41110ActionPerformed(evt);
            }
        });
        p4x4kmap.add(b4x41110);

        b4x41010.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b4x41010.setText("0");
        b4x41010.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4x41010ActionPerformed(evt);
            }
        });
        p4x4kmap.add(b4x41010);

        btReset.setText("Limpar");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        btClose1.setText("Fechar");
        btClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClose1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Resultado =");

        lbResult.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        lbResult.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btClose1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClose1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout p4VarsLayout = new javax.swing.GroupLayout(p4Vars);
        p4Vars.setLayout(p4VarsLayout);
        p4VarsLayout.setHorizontalGroup(
            p4VarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4VarsLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel112)
                .addGap(120, 120, 120))
            .addGroup(p4VarsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p4x4table, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p4VarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p4VarsLayout.createSequentialGroup()
                        .addComponent(p4x4kmap, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        p4VarsLayout.setVerticalGroup(
            p4VarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4VarsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(p4VarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel112))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p4VarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p4x4table, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p4VarsLayout.createSequentialGroup()
                        .addComponent(p4x4kmap, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mapa Karnaugh", p4Vars);

        jLabel139.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel139.setText("Entrada:");

        taInput.setColumns(20);
        taInput.setRows(5);
        jScrollPane1.setViewportView(taInput);

        jLabel140.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel140.setText("Saída:");

        taOutput.setEditable(false);
        taOutput.setColumns(20);
        taOutput.setRows(5);
        jScrollPane2.setViewportView(taOutput);

        btExec.setText("Executar");
        btExec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExecActionPerformed(evt);
            }
        });

        btClean.setText("Limpar");
        btClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCleanActionPerformed(evt);
            }
        });

        btClose2.setText("Fechar");
        btClose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClose2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel139)
                            .addComponent(jLabel140))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btClean, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExec, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btClose2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel139)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel140)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExec, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btClean, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btClose2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Entrada/Saída", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCleanActionPerformed
        taInput.setText("");
        taOutput.setText("");
    }//GEN-LAST:event_btCleanActionPerformed

    private void btExecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExecActionPerformed
        taOutput.setText(solveByInputBackBone(taInput.getText()));
    }//GEN-LAST:event_btExecActionPerformed

    private void b4x41010ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4x41010ActionPerformed
        toggle(b4x41010, bt4x41010);
        solve4x4BackBone();
    }//GEN-LAST:event_b4x41010ActionPerformed

    private void b4x41110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4x41110ActionPerformed
        toggle(b4x41110, bt4x41110);
        solve4x4BackBone();
    }//GEN-LAST:event_b4x41110ActionPerformed

    private void b4x40110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4x40110ActionPerformed
        toggle(b4x40110, bt4x40110);
        solve4x4BackBone();
    }//GEN-LAST:event_b4x40110ActionPerformed

    private void b4x40010ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4x40010ActionPerformed
        toggle(b4x40010, bt4x40010);
        solve4x4BackBone();
    }//GEN-LAST:event_b4x40010ActionPerformed

    private void b4x41011ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4x41011ActionPerformed
        toggle(b4x41011, bt4x41011);
        solve4x4BackBone();
    }//GEN-LAST:event_b4x41011ActionPerformed

    private void b4x41111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4x41111ActionPerformed
        toggle(b4x41111, bt4x41111);
        solve4x4BackBone();
    }//GEN-LAST:event_b4x41111ActionPerformed

    private void b4x40111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4x40111ActionPerformed
        toggle(b4x40111, bt4x40111);
        solve4x4BackBone();
    }//GEN-LAST:event_b4x40111ActionPerformed

    private void b4x40011ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4x40011ActionPerformed
        toggle(b4x40011, bt4x40011);
        solve4x4BackBone();
    }//GEN-LAST:event_b4x40011ActionPerformed

    private void b4x41001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4x41001ActionPerformed
        toggle(b4x41001, bt4x41001);
        solve4x4BackBone();
    }//GEN-LAST:event_b4x41001ActionPerformed

    private void b4x41101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4x41101ActionPerformed
        toggle(b4x41101, bt4x41101);
        solve4x4BackBone();
    }//GEN-LAST:event_b4x41101ActionPerformed

    private void b4x40101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4x40101ActionPerformed
        toggle(b4x40101, bt4x40101);
        solve4x4BackBone();
    }//GEN-LAST:event_b4x40101ActionPerformed

    private void b4x40001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4x40001ActionPerformed
        toggle(b4x40001, bt4x40001);
        solve4x4BackBone();
    }//GEN-LAST:event_b4x40001ActionPerformed

    private void b4x41000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4x41000ActionPerformed
        toggle(b4x41000, bt4x41000);
        solve4x4BackBone();
    }//GEN-LAST:event_b4x41000ActionPerformed

    private void b4x41100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4x41100ActionPerformed
        toggle(b4x41100, bt4x41100);
        solve4x4BackBone();
    }//GEN-LAST:event_b4x41100ActionPerformed

    private void b4x40100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4x40100ActionPerformed
        toggle(b4x40100, bt4x40100);
        solve4x4BackBone();
    }//GEN-LAST:event_b4x40100ActionPerformed

    private void b4x40000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4x40000ActionPerformed
        toggle(b4x40000, bt4x40000);
        solve4x4BackBone();
    }//GEN-LAST:event_b4x40000ActionPerformed

    private void bt4x41111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4x41111ActionPerformed
        toggle(bt4x41111, b4x41111);
        solve4x4BackBone();
    }//GEN-LAST:event_bt4x41111ActionPerformed

    private void bt4x41110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4x41110ActionPerformed
        toggle(bt4x41110, b4x41110);
        solve4x4BackBone();
    }//GEN-LAST:event_bt4x41110ActionPerformed

    private void bt4x41101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4x41101ActionPerformed
        toggle(bt4x41101, b4x41101);
        solve4x4BackBone();
    }//GEN-LAST:event_bt4x41101ActionPerformed

    private void bt4x41100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4x41100ActionPerformed
        toggle(bt4x41100, b4x41100);
        solve4x4BackBone();
    }//GEN-LAST:event_bt4x41100ActionPerformed

    private void bt4x41011ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4x41011ActionPerformed
        toggle(bt4x41011, b4x41011);
        solve4x4BackBone();
    }//GEN-LAST:event_bt4x41011ActionPerformed

    private void bt4x41010ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4x41010ActionPerformed
        toggle(bt4x41010, b4x41010);
        solve4x4BackBone();
    }//GEN-LAST:event_bt4x41010ActionPerformed

    private void bt4x41001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4x41001ActionPerformed
        toggle(bt4x41001, b4x41001);
        solve4x4BackBone();
    }//GEN-LAST:event_bt4x41001ActionPerformed

    private void bt4x41000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4x41000ActionPerformed
        toggle(bt4x41000, b4x41000);
        solve4x4BackBone();
    }//GEN-LAST:event_bt4x41000ActionPerformed

    private void bt4x40111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4x40111ActionPerformed
        toggle(bt4x40111, b4x40111);
        solve4x4BackBone();
    }//GEN-LAST:event_bt4x40111ActionPerformed

    private void bt4x40110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4x40110ActionPerformed
        toggle(bt4x40110, b4x40110);
        solve4x4BackBone();
    }//GEN-LAST:event_bt4x40110ActionPerformed

    private void bt4x40101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4x40101ActionPerformed
        toggle(bt4x40101, b4x40101);
        solve4x4BackBone();
    }//GEN-LAST:event_bt4x40101ActionPerformed

    private void bt4x40100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4x40100ActionPerformed
        toggle(bt4x40100, b4x40100);
        solve4x4BackBone();
    }//GEN-LAST:event_bt4x40100ActionPerformed

    private void bt4x40011ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4x40011ActionPerformed
        toggle(bt4x40011, b4x40011);
        solve4x4BackBone();
    }//GEN-LAST:event_bt4x40011ActionPerformed

    private void bt4x40010ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4x40010ActionPerformed
        toggle(bt4x40010, b4x40010);
        solve4x4BackBone();
    }//GEN-LAST:event_bt4x40010ActionPerformed

    private void bt4x40001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4x40001ActionPerformed
        toggle(bt4x40001, b4x40001);
        solve4x4BackBone();
    }//GEN-LAST:event_bt4x40001ActionPerformed

    private void bt4x40000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4x40000ActionPerformed
        toggle(bt4x40000, b4x40000);
        solve4x4BackBone();
    }//GEN-LAST:event_bt4x40000ActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        bt4x40000.setText("0");
        bt4x40001.setText("0");
        bt4x40010.setText("0");
        bt4x40011.setText("0");
        bt4x40100.setText("0");
        bt4x40101.setText("0");
        bt4x40110.setText("0");
        bt4x40111.setText("0");
        bt4x41000.setText("0");
        bt4x41001.setText("0");
        bt4x41010.setText("0");
        bt4x41011.setText("0");
        bt4x41100.setText("0");
        bt4x41101.setText("0");
        bt4x41110.setText("0");
        bt4x41111.setText("0");
        b4x40000.setText("0");
        b4x40001.setText("0");
        b4x40010.setText("0");
        b4x40011.setText("0");
        b4x40100.setText("0");
        b4x40101.setText("0");
        b4x40110.setText("0");
        b4x40111.setText("0");
        b4x41000.setText("0");
        b4x41001.setText("0");
        b4x41010.setText("0");
        b4x41011.setText("0");
        b4x41100.setText("0");
        b4x41101.setText("0");
        b4x41110.setText("0");
        b4x41111.setText("0");
        
        solve4x4BackBone();
    }//GEN-LAST:event_btResetActionPerformed

    private void btClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClose1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btClose1ActionPerformed

    private void btClose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClose2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btClose2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
                
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StartApp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b4x40000;
    private javax.swing.JButton b4x40001;
    private javax.swing.JButton b4x40010;
    private javax.swing.JButton b4x40011;
    private javax.swing.JButton b4x40100;
    private javax.swing.JButton b4x40101;
    private javax.swing.JButton b4x40110;
    private javax.swing.JButton b4x40111;
    private javax.swing.JButton b4x41000;
    private javax.swing.JButton b4x41001;
    private javax.swing.JButton b4x41010;
    private javax.swing.JButton b4x41011;
    private javax.swing.JButton b4x41100;
    private javax.swing.JButton b4x41101;
    private javax.swing.JButton b4x41110;
    private javax.swing.JButton b4x41111;
    private javax.swing.JButton bt4x40000;
    private javax.swing.JButton bt4x40001;
    private javax.swing.JButton bt4x40010;
    private javax.swing.JButton bt4x40011;
    private javax.swing.JButton bt4x40100;
    private javax.swing.JButton bt4x40101;
    private javax.swing.JButton bt4x40110;
    private javax.swing.JButton bt4x40111;
    private javax.swing.JButton bt4x41000;
    private javax.swing.JButton bt4x41001;
    private javax.swing.JButton bt4x41010;
    private javax.swing.JButton bt4x41011;
    private javax.swing.JButton bt4x41100;
    private javax.swing.JButton bt4x41101;
    private javax.swing.JButton bt4x41110;
    private javax.swing.JButton bt4x41111;
    private javax.swing.JButton btClean;
    private javax.swing.JButton btClose1;
    private javax.swing.JButton btClose2;
    private javax.swing.JButton btExec;
    private javax.swing.JButton btReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbResult;
    private javax.swing.JPanel p4Vars;
    private javax.swing.JPanel p4x4kmap;
    private javax.swing.JPanel p4x4table;
    private javax.swing.JTextArea taInput;
    private javax.swing.JTextArea taOutput;
    // End of variables declaration//GEN-END:variables
}
