package ibmw;

public class IBMW extends javax.swing.JFrame {

    public IBMW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productoresPanel = new javax.swing.JPanel();
        despachoLabel = new javax.swing.JLabel();
        diasDespachoLabel = new javax.swing.JLabel();
        productoresLabel = new javax.swing.JLabel();
        ruedasProdPanel = new javax.swing.JPanel();
        agregarProdRuedasButton = new javax.swing.JButton();
        prodRuedasLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        cantProdRuedas = new javax.swing.JLabel();
        restarProdRuedasButton = new javax.swing.JButton();
        motoresProdPanel = new javax.swing.JPanel();
        agregarProdMotoresButton = new javax.swing.JButton();
        prodMotoresLabel = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        cantProdMotores = new javax.swing.JLabel();
        restarProdMotoresButton = new javax.swing.JButton();
        parabProdPanel = new javax.swing.JPanel();
        agregarProdParabrisasButton = new javax.swing.JButton();
        prodParabrisasLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        cantProdParabrisas = new javax.swing.JLabel();
        restarProdParabrisasButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jefeLabel = new javax.swing.JLabel();
        estadoJefeLabel = new javax.swing.JLabel();
        gerenteLabel = new javax.swing.JLabel();
        estadoGerenteLabel = new javax.swing.JLabel();
        almacenPanel = new javax.swing.JPanel();
        almacenLabel = new javax.swing.JLabel();
        ensambladoresLabel = new javax.swing.JLabel();
        ruedasLabel = new javax.swing.JLabel();
        parabrisasLabel = new javax.swing.JLabel();
        motoresLabel = new javax.swing.JLabel();
        carrosLabel = new javax.swing.JLabel();
        nRuedasLabel = new javax.swing.JLabel();
        nParabrisasLabel = new javax.swing.JLabel();
        nMotoresLabel = new javax.swing.JLabel();
        nCarrosLabel = new javax.swing.JLabel();
        maxLabel = new javax.swing.JLabel();
        maxRuedasLabel = new javax.swing.JLabel();
        maxParabrisasLabel = new javax.swing.JLabel();
        maxMotoresLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        agregarEnsambladorButton = new javax.swing.JButton();
        agregarEnsambladorButton1 = new javax.swing.JButton();
        cantEnsambladoresLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(820, 483));
        setResizable(false);

        productoresPanel.setBackground(new java.awt.Color(225, 225, 225));
        productoresPanel.setPreferredSize(new java.awt.Dimension(650, 430));

        despachoLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        despachoLabel.setText("Dias para el próximo despacho:");

        diasDespachoLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        diasDespachoLabel.setText("5");

        productoresLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productoresLabel.setText("Productores:");

        ruedasProdPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ruedasProdPanel.setPreferredSize(new java.awt.Dimension(180, 0));

        agregarProdRuedasButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarProdRuedasButton.setText("+");
        agregarProdRuedasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProdRuedasButtonActionPerformed(evt);
            }
        });

        prodRuedasLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prodRuedasLabel.setText("Prod. Ruedas");

        cantProdRuedas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cantProdRuedas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantProdRuedas.setText("1");

        restarProdRuedasButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        restarProdRuedasButton.setText("-");
        restarProdRuedasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarProdRuedasButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ruedasProdPanelLayout = new javax.swing.GroupLayout(ruedasProdPanel);
        ruedasProdPanel.setLayout(ruedasProdPanelLayout);
        ruedasProdPanelLayout.setHorizontalGroup(
            ruedasProdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(ruedasProdPanelLayout.createSequentialGroup()
                .addGroup(ruedasProdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ruedasProdPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(prodRuedasLabel))
                    .addGroup(ruedasProdPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(ruedasProdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agregarProdRuedasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantProdRuedas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(restarProdRuedasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        ruedasProdPanelLayout.setVerticalGroup(
            ruedasProdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ruedasProdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prodRuedasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(cantProdRuedas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(agregarProdRuedasButton)
                .addGap(18, 18, 18)
                .addComponent(restarProdRuedasButton)
                .addGap(82, 82, 82))
        );

        motoresProdPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        motoresProdPanel.setPreferredSize(new java.awt.Dimension(180, 100));

        agregarProdMotoresButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarProdMotoresButton.setText("+");
        agregarProdMotoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProdMotoresButtonActionPerformed(evt);
            }
        });

        prodMotoresLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prodMotoresLabel.setText("Prod. Motores");

        cantProdMotores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cantProdMotores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantProdMotores.setText("3");

        restarProdMotoresButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        restarProdMotoresButton.setText("-");
        restarProdMotoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarProdMotoresButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout motoresProdPanelLayout = new javax.swing.GroupLayout(motoresProdPanel);
        motoresProdPanel.setLayout(motoresProdPanelLayout);
        motoresProdPanelLayout.setHorizontalGroup(
            motoresProdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, motoresProdPanelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(prodMotoresLabel)
                .addGap(41, 41, 41))
            .addGroup(motoresProdPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(motoresProdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agregarProdMotoresButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cantProdMotores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restarProdMotoresButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        motoresProdPanelLayout.setVerticalGroup(
            motoresProdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(motoresProdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prodMotoresLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cantProdMotores)
                .addGap(67, 67, 67)
                .addComponent(agregarProdMotoresButton)
                .addGap(18, 18, 18)
                .addComponent(restarProdMotoresButton)
                .addGap(80, 80, 80))
        );

        parabProdPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        parabProdPanel.setPreferredSize(new java.awt.Dimension(180, 339));

        agregarProdParabrisasButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarProdParabrisasButton.setText("+");
        agregarProdParabrisasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProdParabrisasButtonActionPerformed(evt);
            }
        });

        prodParabrisasLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prodParabrisasLabel.setText("Prod. Parabrisas");

        cantProdParabrisas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cantProdParabrisas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantProdParabrisas.setText("2");

        restarProdParabrisasButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        restarProdParabrisasButton.setText("-");
        restarProdParabrisasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarProdParabrisasButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout parabProdPanelLayout = new javax.swing.GroupLayout(parabProdPanel);
        parabProdPanel.setLayout(parabProdPanelLayout);
        parabProdPanelLayout.setHorizontalGroup(
            parabProdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(parabProdPanelLayout.createSequentialGroup()
                .addGroup(parabProdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parabProdPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(prodParabrisasLabel))
                    .addGroup(parabProdPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(parabProdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agregarProdParabrisasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantProdParabrisas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(restarProdParabrisasButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        parabProdPanelLayout.setVerticalGroup(
            parabProdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parabProdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prodParabrisasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cantProdParabrisas)
                .addGap(66, 66, 66)
                .addComponent(agregarProdParabrisasButton)
                .addGap(18, 18, 18)
                .addComponent(restarProdParabrisasButton)
                .addGap(82, 82, 82))
        );

        jefeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jefeLabel.setText("Jefe:");

        estadoJefeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estadoJefeLabel.setText("Durmiendo...");

        gerenteLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gerenteLabel.setText("Gerente:");

        estadoGerenteLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estadoGerenteLabel.setText("Durmiendo...");

        javax.swing.GroupLayout productoresPanelLayout = new javax.swing.GroupLayout(productoresPanel);
        productoresPanel.setLayout(productoresPanelLayout);
        productoresPanelLayout.setHorizontalGroup(
            productoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(productoresPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(productoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productoresPanelLayout.createSequentialGroup()
                        .addComponent(productoresLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(productoresPanelLayout.createSequentialGroup()
                        .addGroup(productoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(productoresPanelLayout.createSequentialGroup()
                                .addComponent(despachoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(diasDespachoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(productoresPanelLayout.createSequentialGroup()
                                .addComponent(ruedasProdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(parabProdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(motoresProdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(productoresPanelLayout.createSequentialGroup()
                                .addComponent(jefeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(estadoJefeLabel)
                                .addGap(120, 120, 120)
                                .addComponent(gerenteLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(estadoGerenteLabel)))
                        .addGap(0, 30, Short.MAX_VALUE))))
        );
        productoresPanelLayout.setVerticalGroup(
            productoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productoresPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(despachoLabel)
                    .addComponent(diasDespachoLabel))
                .addGap(18, 18, 18)
                .addComponent(productoresLabel)
                .addGap(18, 18, 18)
                .addGroup(productoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(parabProdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ruedasProdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(motoresProdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(productoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jefeLabel)
                    .addComponent(estadoJefeLabel)
                    .addComponent(gerenteLabel)
                    .addComponent(estadoGerenteLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        almacenPanel.setPreferredSize(new java.awt.Dimension(150, 400));

        almacenLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        almacenLabel.setText("Almacén:");

        ensambladoresLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ensambladoresLabel.setText("Ensambladores:");

        ruedasLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ruedasLabel.setText("Ruedas:");

        parabrisasLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        parabrisasLabel.setText("Parabrisas:");

        motoresLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        motoresLabel.setText("Motores:");

        carrosLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        carrosLabel.setText("Carros:");

        nRuedasLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nRuedasLabel.setText("5");

        nParabrisasLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nParabrisasLabel.setText("5");

        nMotoresLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nMotoresLabel.setText("5");

        nCarrosLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nCarrosLabel.setText("5");

        maxLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maxLabel.setText("Max.");

        maxRuedasLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maxRuedasLabel.setText("6");

        maxParabrisasLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maxParabrisasLabel.setText("6");

        maxMotoresLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maxMotoresLabel.setText("6");

        agregarEnsambladorButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarEnsambladorButton.setText("+");
        agregarEnsambladorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEnsambladorButtonActionPerformed(evt);
            }
        });

        agregarEnsambladorButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarEnsambladorButton1.setText("+");
        agregarEnsambladorButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEnsambladorButton1ActionPerformed(evt);
            }
        });

        cantEnsambladoresLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cantEnsambladoresLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantEnsambladoresLabel.setText("2");

        javax.swing.GroupLayout almacenPanelLayout = new javax.swing.GroupLayout(almacenPanel);
        almacenPanel.setLayout(almacenPanelLayout);
        almacenPanelLayout.setHorizontalGroup(
            almacenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(almacenPanelLayout.createSequentialGroup()
                .addGroup(almacenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(almacenPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(almacenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(almacenPanelLayout.createSequentialGroup()
                                .addGroup(almacenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(almacenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(motoresLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(parabrisasLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(ruedasLabel)
                                    .addComponent(carrosLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(almacenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nCarrosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                    .addComponent(nParabrisasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nMotoresLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nRuedasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(almacenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maxRuedasLabel)
                                    .addComponent(maxParabrisasLabel)
                                    .addComponent(maxMotoresLabel)))
                            .addGroup(almacenPanelLayout.createSequentialGroup()
                                .addComponent(almacenLabel)
                                .addGap(36, 36, 36)
                                .addComponent(maxLabel))
                            .addComponent(ensambladoresLabel)))
                    .addGroup(almacenPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(almacenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agregarEnsambladorButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agregarEnsambladorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantEnsambladoresLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        almacenPanelLayout.setVerticalGroup(
            almacenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(almacenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(almacenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(almacenLabel)
                    .addComponent(maxLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(almacenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruedasLabel)
                    .addComponent(nRuedasLabel)
                    .addComponent(maxRuedasLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(almacenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parabrisasLabel)
                    .addComponent(nParabrisasLabel)
                    .addComponent(maxParabrisasLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(almacenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motoresLabel)
                    .addComponent(nMotoresLabel)
                    .addComponent(maxMotoresLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(almacenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carrosLabel)
                    .addComponent(nCarrosLabel))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(ensambladoresLabel)
                .addGap(32, 32, 32)
                .addComponent(cantEnsambladoresLabel)
                .addGap(45, 45, 45)
                .addComponent(agregarEnsambladorButton)
                .addGap(18, 18, 18)
                .addComponent(agregarEnsambladorButton1)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(productoresPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(almacenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productoresPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
            .addComponent(almacenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private Fabrica fabrica;
    private int maxRuedas, maxParabrisas, maxMotores, maxEnsambladores, ruedasIniciales, parabrisasIniciales, motoresIniciales, ensambladoresIniciales;

    public void start(int tiempoDia, int tiempoParaDespacho, int maxRuedas, int maxParabrisas, int maxMotores, int maxEnsambladores, int ruedasIniciales, int parabrisasIniciales, int motoresIniciales, int ensambladoresIniciales, int eMesLimit, int mMesLimit, int dMesLimit) {

        this.maxRuedas = maxRuedas;
        this.maxParabrisas = maxParabrisas;
        this.maxMotores = maxMotores;
        this.maxEnsambladores = maxEnsambladores;
        this.ruedasIniciales = ruedasIniciales;
        this.parabrisasIniciales = parabrisasIniciales;
        this.motoresIniciales = motoresIniciales;
        this.ensambladoresIniciales = ensambladoresIniciales;


        this.fabrica = new Fabrica(tiempoDia, tiempoParaDespacho, maxRuedas, maxParabrisas, maxMotores, maxEnsambladores, ruedasIniciales, parabrisasIniciales, motoresIniciales, ensambladoresIniciales, eMesLimit, mMesLimit, dMesLimit, this);
        WindowUpdater windowUpdater = new WindowUpdater(this.fabrica, this.fabrica.getJefe(), this.fabrica.getGerente());
        windowUpdater.start();
    }


    private void agregarEnsambladorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEnsambladorButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarEnsambladorButtonActionPerformed

    private void agregarProdMotoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProdMotoresButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarProdMotoresButtonActionPerformed

    private void agregarProdRuedasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProdRuedasButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarProdRuedasButtonActionPerformed

    private void agregarProdParabrisasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProdParabrisasButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarProdParabrisasButtonActionPerformed

    private void restarProdMotoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarProdMotoresButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restarProdMotoresButtonActionPerformed

    private void restarProdParabrisasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarProdParabrisasButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restarProdParabrisasButtonActionPerformed

    private void restarProdRuedasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarProdRuedasButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restarProdRuedasButtonActionPerformed

    private void agregarEnsambladorButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEnsambladorButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarEnsambladorButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarEnsambladorButton;
    private javax.swing.JButton agregarEnsambladorButton1;
    private javax.swing.JButton agregarProdMotoresButton;
    private javax.swing.JButton agregarProdParabrisasButton;
    private javax.swing.JButton agregarProdRuedasButton;
    private javax.swing.JLabel almacenLabel;
    private javax.swing.JPanel almacenPanel;
    public static javax.swing.JLabel cantEnsambladoresLabel;
    public static javax.swing.JLabel cantProdMotores;
    public static javax.swing.JLabel cantProdParabrisas;
    public static javax.swing.JLabel cantProdRuedas;
    private javax.swing.JLabel carrosLabel;
    private javax.swing.JLabel despachoLabel;
    private javax.swing.JLabel diasDespachoLabel;
    private javax.swing.JLabel ensambladoresLabel;
    public static javax.swing.JLabel estadoGerenteLabel;
    public static javax.swing.JLabel estadoJefeLabel;
    private javax.swing.JLabel gerenteLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel jefeLabel;
    private javax.swing.JLabel maxLabel;
    public static javax.swing.JLabel maxMotoresLabel;
    public static javax.swing.JLabel maxParabrisasLabel;
    public static javax.swing.JLabel maxRuedasLabel;
    private javax.swing.JLabel motoresLabel;
    private javax.swing.JPanel motoresProdPanel;
    public static javax.swing.JLabel nCarrosLabel;
    public static javax.swing.JLabel nMotoresLabel;
    public static javax.swing.JLabel nParabrisasLabel;
    public static javax.swing.JLabel nRuedasLabel;
    private javax.swing.JPanel parabProdPanel;
    private javax.swing.JLabel parabrisasLabel;
    private javax.swing.JLabel prodMotoresLabel;
    private javax.swing.JLabel prodParabrisasLabel;
    private javax.swing.JLabel prodRuedasLabel;
    private javax.swing.JLabel productoresLabel;
    private javax.swing.JPanel productoresPanel;
    private javax.swing.JButton restarProdMotoresButton;
    private javax.swing.JButton restarProdParabrisasButton;
    private javax.swing.JButton restarProdRuedasButton;
    private javax.swing.JLabel ruedasLabel;
    private javax.swing.JPanel ruedasProdPanel;
    // End of variables declaration//GEN-END:variables
}
