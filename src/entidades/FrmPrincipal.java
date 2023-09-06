package entidades;

import controlador.ClienteController;
import dao.*;
import java.util.List;
import javax.swing.JOptionPane;

public class FrmPrincipal extends javax.swing.JFrame {

    //
    Cliente cl = new Cliente();
    ClienteDAO clDAO = new ClienteDAO();
    //
    Proveedor prov = new Proveedor();
    ProveedorDAO provDAO = new ProveedorDAO();
    //
    Producto prodProforma = new Producto();
    Producto prodAgregado = new Producto();
    Producto prodVenta = new Producto();
    //        
    ProductoDAO prodDAO = new ProductoDAO();
    CompraDAO compraDAO = new CompraDAO();
    Compra compra = new Compra();
    DetalleCompra detalleCompra = new DetalleCompra();
    //
    double totalaPagar;
    double totalaPagarVenta;
    //
    DetalleVenta detalleProformaVenta = new DetalleVenta();
    VentaDAO ventaDAO = new VentaDAO();
    Venta venta = new Venta();

    private int idProducto;
    private int idCompra;
    private int idVenta;

    private String codigoProducto = "";

    public FrmPrincipal() {
        initComponents();
        FrmLogin frm = new FrmLogin();

        idCompra = 0;
        txtIdCompra.setText(String.valueOf(IdDeCompra()));
        //
        idVenta = 0;
        txtCodVentaProd.setText(String.valueOf(IdDeVenta()));
        //
        txtIdProd.setText(String.valueOf(idProducto));
        //txtCodVentaProd.setText(String.valueOf(idVenta));
        //
        setLocationRelativeTo(null);
        setResizable(false);
        for (int i = 0; i < jtbdPanelGral.countComponents(); i++) {
            jtbdPanelGral.setEnabledAt(i, false);
        }
        cbxcodigoProducto.setVisible(false);
        btnActualizarCodProducto.setVisible(false);

        txtIdProd.setVisible(false);
        lblIdProducto.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtbdPanelGral = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxtVenta = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        atxtReporte = new javax.swing.JTextArea();
        btnAgregarVenta = new javax.swing.JButton();
        btnLimpiarVentaProducto = new javax.swing.JButton();
        btnImprimirVenta = new javax.swing.JButton();
        btnActualizarIDClientes = new javax.swing.JButton();
        btnActualizarCodProductoVenta = new javax.swing.JButton();
        cbxIdClienteVenta = new javax.swing.JComboBox<>();
        cbxProductoVenta = new javax.swing.JComboBox<>();
        txtTotalVenta = new javax.swing.JFormattedTextField();
        txtCodVentaProd = new javax.swing.JTextField();
        txtDescVentaProd = new javax.swing.JTextField();
        txtCntVentaProd = new javax.swing.JTextField();
        txtStockDispProd = new javax.swing.JTextField();
        txtPrecioVentaProd = new javax.swing.JTextField();
        txtDireccionClienteVenta = new javax.swing.JTextField();
        txtTelefonoClienteVenta = new javax.swing.JTextField();
        txtNombreClienteVenta = new javax.swing.JTextField();
        btnLimpiarClienteVenta = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtDniCliente = new javax.swing.JTextField();
        txtTelCliente = new javax.swing.JTextField();
        txtRazonCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        atxtReporteCliente = new javax.swing.JTextArea();
        btnAgregarCliente = new javax.swing.JButton();
        btnLimpiarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnActualizarCliente = new javax.swing.JButton();
        cbxIdClientes = new javax.swing.JComboBox<>();
        chbxEscogerIDClientes = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        atxtReporteProv = new javax.swing.JTextArea();
        btnAgregarProv = new javax.swing.JButton();
        btnLimpiarProv = new javax.swing.JButton();
        btnActualizarProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        txtDescProv = new javax.swing.JTextField();
        txtTelProv = new javax.swing.JTextField();
        txtDirProv = new javax.swing.JTextField();
        txtRazProv = new javax.swing.JTextField();
        txtRucProv = new javax.swing.JTextField();
        chbxElegirIDProveedor = new javax.swing.JCheckBox();
        cbxIdProveedores = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        lblIdProducto = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtCantidadDisponibleProd = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        atxtReporteProductos = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        atxtReporteCompraFinal = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        atxtListaProductos = new javax.swing.JTextArea();
        cbxProvProd = new javax.swing.JComboBox<>();
        cbxcodigoProducto = new javax.swing.JComboBox<>();
        txtIdProd = new javax.swing.JTextField();
        txtDescProd = new javax.swing.JTextField();
        txtCantProd = new javax.swing.JTextField();
        txtPrecioProd = new javax.swing.JTextField();
        txtMovil = new javax.swing.JTextField();
        txtRemitenteCompra = new javax.swing.JTextField();
        txtCodigoProducto = new javax.swing.JTextField();
        txtIdCompra = new javax.swing.JTextField();
        txtPrecioMovil = new javax.swing.JFormattedTextField();
        btnRegistrarProd = new javax.swing.JButton();
        btnNuevoProd = new javax.swing.JButton();
        btnActualizarProvProd = new javax.swing.JButton();
        btnImprimirCompra = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        btnActualizarCodProducto = new javax.swing.JButton();
        btnModificarProd = new javax.swing.JButton();
        txtTotalAPagar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbtnNVenta = new javax.swing.JButton();
        jbtnCliente = new javax.swing.JButton();
        jbtnProv = new javax.swing.JButton();
        btnProd = new javax.swing.JButton();
        lblConectado = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FrmPrincipal");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Cód. Venta");

        jLabel2.setText("Desc.");

        jLabel3.setText("#");

        jLabel4.setText("Precio");

        jLabel5.setText("Stock Disp.");

        jLabel6.setText("Cód. Cliente");

        jLabel7.setText("Nombres y Apellidos");

        jLabel8.setText("S/... Total a Pagar");

        jLabel10.setText("Teléfono");

        jLabel11.setText("Dirección");

        jLabel13.setText("Reporte");

        jLabel25.setText("Cód. Producto");

        atxtVenta.setEditable(false);
        atxtVenta.setColumns(20);
        atxtVenta.setRows(5);
        jScrollPane1.setViewportView(atxtVenta);

        atxtReporte.setEditable(false);
        atxtReporte.setColumns(20);
        atxtReporte.setRows(5);
        jScrollPane2.setViewportView(atxtReporte);

        btnAgregarVenta.setText("Agregar Venta");
        btnAgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVentaActionPerformed(evt);
            }
        });

        btnLimpiarVentaProducto.setText("Limpiar");
        btnLimpiarVentaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarVentaProductoActionPerformed(evt);
            }
        });

        btnImprimirVenta.setText("Imprimir");
        btnImprimirVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirVentaActionPerformed(evt);
            }
        });

        btnActualizarIDClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        btnActualizarIDClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarIDClientesActionPerformed(evt);
            }
        });

        btnActualizarCodProductoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        btnActualizarCodProductoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCodProductoVentaActionPerformed(evt);
            }
        });

        cbxIdClienteVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxIdClienteVentaMouseClicked(evt);
            }
        });

        cbxProductoVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxProductoVentaMouseClicked(evt);
            }
        });

        txtTotalVenta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        txtCodVentaProd.setEditable(false);
        txtCodVentaProd.setBackground(new java.awt.Color(204, 204, 204));

        txtDescVentaProd.setEditable(false);
        txtDescVentaProd.setBackground(new java.awt.Color(204, 204, 204));

        txtStockDispProd.setEditable(false);
        txtStockDispProd.setBackground(new java.awt.Color(204, 204, 204));

        txtPrecioVentaProd.setEditable(false);
        txtPrecioVentaProd.setBackground(new java.awt.Color(204, 204, 204));

        txtDireccionClienteVenta.setEditable(false);
        txtDireccionClienteVenta.setBackground(new java.awt.Color(204, 204, 204));

        txtTelefonoClienteVenta.setEditable(false);
        txtTelefonoClienteVenta.setBackground(new java.awt.Color(204, 204, 204));

        txtNombreClienteVenta.setEditable(false);
        txtNombreClienteVenta.setBackground(new java.awt.Color(204, 204, 204));

        btnLimpiarClienteVenta.setText("Limpiar");
        btnLimpiarClienteVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarClienteVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cbxIdClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizarIDClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccionClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregarVenta)
                        .addGap(92, 92, 92)
                        .addComponent(btnLimpiarVentaProducto)
                        .addGap(172, 172, 172))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnImprimirVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(btnLimpiarClienteVenta)))
                        .addContainerGap(181, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1))
                            .addComponent(txtCodVentaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cbxProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizarCodProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescVentaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtCntVentaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtStockDispProd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioVentaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel25))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCodVentaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescVentaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtStockDispProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioVentaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCntVentaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnActualizarCodProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiarVentaProducto)
                            .addComponent(btnAgregarVenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxIdClienteVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTelefonoClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDireccionClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(btnActualizarIDClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimirVenta)
                    .addComponent(btnLimpiarClienteVenta))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jtbdPanelGral.addTab("F. Venta:", jPanel3);

        jLabel14.setText("Nombres y Apellidos de Cliente:");

        jLabel15.setText("DNI:");

        jLabel16.setText("Teléfono:");

        jLabel17.setText("Razón:");

        jLabel18.setText("Dirección:");

        atxtReporteCliente.setEditable(false);
        atxtReporteCliente.setColumns(20);
        atxtReporteCliente.setRows(5);
        jScrollPane3.setViewportView(atxtReporteCliente);

        btnAgregarCliente.setText("Agregar Cliente");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        btnLimpiarCliente.setText("Limpiar");
        btnLimpiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnActualizarCliente.setText("Actualizar");
        btnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClienteActionPerformed(evt);
            }
        });

        cbxIdClientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxIdClientesItemStateChanged(evt);
            }
        });
        cbxIdClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxIdClientesMouseClicked(evt);
            }
        });

        chbxEscogerIDClientes.setText("Elegir");
        chbxEscogerIDClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxEscogerIDClientesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(btnAgregarCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnLimpiarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizarCliente)
                                .addGap(41, 41, 41)
                                .addComponent(btnEliminarCliente)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 31, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(txtRazonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(64, 64, 64))
                                            .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15))
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(chbxEscogerIDClientes)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbxIdClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel18)
                                                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(92, 92, 92)))))))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxIdClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxEscogerIDClientes))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCliente)
                    .addComponent(btnLimpiarCliente)
                    .addComponent(btnEliminarCliente)
                    .addComponent(btnActualizarCliente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtbdPanelGral.addTab("F. Cliente:", jPanel4);

        jLabel20.setText("Descripción:");

        jLabel21.setText("Teléfono:");

        jLabel22.setText("Dirección:");

        jLabel24.setText("Razón:");

        jLabel23.setText("Proveedores:");

        jLabel31.setText("DNI\\RUC:");

        atxtReporteProv.setEditable(false);
        atxtReporteProv.setColumns(20);
        atxtReporteProv.setRows(5);
        jScrollPane4.setViewportView(atxtReporteProv);

        btnAgregarProv.setText("Agregar Prov.");
        btnAgregarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProvActionPerformed(evt);
            }
        });

        btnLimpiarProv.setText("Limpiar");
        btnLimpiarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarProvActionPerformed(evt);
            }
        });

        btnActualizarProveedor.setText("Actualizar");
        btnActualizarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProveedorActionPerformed(evt);
            }
        });

        btnEliminarProveedor.setText("Eliminar");
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });

        chbxElegirIDProveedor.setText("Elegir");
        chbxElegirIDProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxElegirIDProveedorMouseClicked(evt);
            }
        });

        cbxIdProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxIdProveedoresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane4)
                .addGap(12, 12, 12))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRucProv, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelProv, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addGap(93, 93, 93)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(txtDirProv, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addComponent(chbxElegirIDProveedor))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtDescProv, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel20))
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel24)
                                                    .addComponent(txtRazProv, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(btnAgregarProv)
                                        .addGap(109, 109, 109)
                                        .addComponent(btnLimpiarProv)
                                        .addGap(70, 70, 70)
                                        .addComponent(btnActualizarProveedor)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(cbxIdProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)))))))
                .addGap(58, 58, 58))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel31)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRucProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbxElegirIDProveedor)
                    .addComponent(cbxIdProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarProv)
                    .addComponent(btnActualizarProveedor)
                    .addComponent(btnEliminarProveedor)
                    .addComponent(btnLimpiarProv))
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtbdPanelGral.addTab("F. Proveedor", jPanel5);

        lblIdProducto.setText("Id:");

        jLabel26.setText("Descripción:");

        jLabel27.setText("Cantidad:");

        jLabel28.setText("Precio Und.:");

        jLabel35.setText("Remitente:");

        jLabel32.setText("Placa Movilidad:");

        jLabel29.setText("Proveedor:");

        jLabel33.setText("Precio:");

        jLabel30.setText("Productos:");

        jLabel40.setText("]");

        jLabel38.setText("Código:");

        jLabel39.setText("Id[");

        jLabel37.setText("Compra:");

        txtCantidadDisponibleProd.setBackground(new java.awt.Color(204, 204, 204));
        txtCantidadDisponibleProd.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        atxtReporteProductos.setEditable(false);
        atxtReporteProductos.setColumns(20);
        atxtReporteProductos.setRows(5);
        jScrollPane5.setViewportView(atxtReporteProductos);

        atxtReporteCompraFinal.setEditable(false);
        atxtReporteCompraFinal.setColumns(20);
        atxtReporteCompraFinal.setRows(5);
        jScrollPane6.setViewportView(atxtReporteCompraFinal);

        atxtListaProductos.setEditable(false);
        atxtListaProductos.setColumns(20);
        atxtListaProductos.setRows(5);
        jScrollPane7.setViewportView(atxtListaProductos);

        cbxProvProd.setBackground(new java.awt.Color(204, 204, 204));

        cbxcodigoProducto.setBackground(new java.awt.Color(204, 204, 204));
        cbxcodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxcodigoProductoActionPerformed(evt);
            }
        });

        txtIdProd.setEditable(false);
        txtIdProd.setBackground(new java.awt.Color(204, 204, 204));

        txtRemitenteCompra.setEditable(false);
        txtRemitenteCompra.setBackground(new java.awt.Color(204, 204, 204));

        txtCodigoProducto.setEditable(false);
        txtCodigoProducto.setBackground(new java.awt.Color(204, 204, 204));

        txtIdCompra.setEditable(false);
        txtIdCompra.setBackground(new java.awt.Color(204, 204, 204));

        btnRegistrarProd.setText("Registrar");
        btnRegistrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProdActionPerformed(evt);
            }
        });

        btnNuevoProd.setText("Limpiar");
        btnNuevoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProdActionPerformed(evt);
            }
        });

        btnActualizarProvProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        btnActualizarProvProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProvProdActionPerformed(evt);
            }
        });

        btnImprimirCompra.setText("Imprimir");
        btnImprimirCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirCompraActionPerformed(evt);
            }
        });

        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnActualizarCodProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        btnActualizarCodProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCodProductoActionPerformed(evt);
            }
        });

        btnModificarProd.setText("Agregar");
        btnModificarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProdActionPerformed(evt);
            }
        });

        jLabel9.setText("Total S/.");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(cbxProvProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15)
                                                .addComponent(btnActualizarProvProd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtPrecioMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(txtIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btnImprimirCompra))))))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(cbxcodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnActualizarCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14))
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addComponent(txtIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addComponent(lblIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel28))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(txtCantProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCantidadDisponibleProd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(btnBuscarProducto)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnModificarProd))))
                                    .addComponent(jLabel30))
                                .addGap(0, 210, Short.MAX_VALUE))
                            .addComponent(jScrollPane5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(btnRegistrarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnNuevoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRemitenteCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(123, 123, 123)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane7))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnActualizarCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxcodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnBuscarProducto)
                                    .addComponent(btnModificarProd))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCantProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel26)
                                    .addComponent(lblIdProducto)
                                    .addComponent(jLabel28))
                                .addGap(19, 19, 19)
                                .addComponent(txtCantidadDisponibleProd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarProd)
                            .addComponent(btnNuevoProd))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizarProvProd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtRemitenteCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrecioMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxProvProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(btnImprimirCompra))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel39)
                    .addComponent(txtIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );

        jtbdPanelGral.addTab("F. Producto", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtbdPanelGral))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtbdPanelGral, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbtnNVenta.setText("Nueva Venta");
        jbtnNVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNVentaActionPerformed(evt);
            }
        });

        jbtnCliente.setText("Clientes");
        jbtnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClienteActionPerformed(evt);
            }
        });

        jbtnProv.setText("Proveedor");
        jbtnProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnProvActionPerformed(evt);
            }
        });

        btnProd.setText("Producto");
        btnProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdActionPerformed(evt);
            }
        });

        lblConectado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel34.setText("Bienvenido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnNVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblConectado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel34)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblConectado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jbtnNVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnProv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProd)
                .addContainerGap(488, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //VENTA
    public void LimpiarVenta() {
        txtCodVentaProd.setText("");
        txtDescVentaProd.setText("");
        txtCntVentaProd.setText("");
        txtStockDispProd.setText("");
        txtPrecioVentaProd.setText("");
        atxtVenta.setText("");
    }

    //CLIENTE
    public void LimpiarCliente() {
        txtDniCliente.setText("");
        txtNombreCliente.setText("");
        txtTelCliente.setText("");
        txtDireccionCliente.setText("");
        txtRazonCliente.setText("");
    }

    public void ListarClienteIdCBX() {
        ClienteController clienteController = new ClienteController();
        btnActualizarIDClientes.setVisible(true);
        cbxIdClientes.removeAllItems();

        List<Cliente> cliente = clienteController.listarClientes();
        //Cliente cliente;
        for (Cliente c : cliente) {
            cbxIdClientes.addItem(String.valueOf(c.getId()));
        }
        /*for (int i = 0; i < clDAO.ListarCliente().size(); i++) {
            cliente = (Cliente) clDAO.ListarCliente().get(i);
            cbxIdClientes.addItem(String.valueOf(cliente.getId()));
        }*/
    }

    public void ListarClienteReporte() {
        atxtReporteCliente.setText(null);

        Cliente cliente;

        for (int i = 0; i < clDAO.ListarCliente().size(); i++) {
            cliente = (Cliente) clDAO.ListarCliente().get(i);
            atxtReporteCliente.append(cliente.toString() + "\n");
        }
    }

    //CLIENTE EN VENTA
    public void LimpiarCLienteEnVenta() {
        txtNombreClienteVenta.setText("");
        txtDireccionClienteVenta.setText("");
        txtTelefonoClienteVenta.setText("");
    }

    public void ListarClienteVentaIdCBX() {
        cbxIdClienteVenta.removeAllItems();

        Cliente cliente;

        for (int i = 0; i < clDAO.ListarCliente().size(); i++) {
            cliente = (Cliente) clDAO.ListarCliente().get(i);
            cbxIdClienteVenta.addItem(String.valueOf(cliente.getId()));
        }
    }

    //PROVEEEDOR
    public void LimpiarProveedor() {
        txtDescProv.setText("");
        txtRazProv.setText("");
        txtTelProv.setText("");
        txtRucProv.setText("");
        txtDirProv.setText("");
    }

    public void ListarProveedorIdCBX() {
        cbxIdProveedores.removeAllItems();

        Proveedor proveedor;

        for (int i = 0; i < provDAO.ListarProveedor().size(); i++) {
            proveedor = (Proveedor) provDAO.ListarProveedor().get(i);
            cbxIdProveedores.addItem(String.valueOf(proveedor.getId()));
        }
    }

    public void ListarProveedorReporte() {
        atxtReporteProv.setText(null);

        Proveedor proveedor;

        for (int i = 0; i < provDAO.ListarProveedor().size(); i++) {
            proveedor = (Proveedor) provDAO.ListarProveedor().get(i);
            atxtReporteProv.append(proveedor.toString() + "\n");
        }
    }

    //PRODUCTO
    public void LimpiarProducto() {
        txtDescProd.setText("");
        txtCantProd.setText("");
        txtPrecioProd.setText("");
        txtCantidadDisponibleProd.setText("");
        txtCodigoProducto.setText("");
        txtTotalAPagar.setText("");
        txtPrecioMovil.setText("");
        txtMovil.setText("");
    }

    public void ListarProveedorCompraIdCBX() {
        cbxProvProd.removeAllItems();

        Proveedor proveedor;

        for (int i = 0; i < provDAO.ListarProveedor().size(); i++) {
            proveedor = (Proveedor) provDAO.ListarProveedor().get(i);
            cbxProvProd.addItem(String.valueOf(proveedor.getNombre()));
        }
    }

    //CODPRODUCTO
    public String CodigoDesc(String txt, int n) {
        String txtfin = "";
        if (n > txt.length()) {
            n = txt.length();
        }
        for (int i = 0; i < n; i++) {
            if (!String.valueOf(txt.charAt(i)).equals(" ")) {
                txtfin += txt.charAt(i);
            }
        }
        return txtfin;
    }

    //COMPRA DE PRODUCTO
    ///***TOTAL A PAGAR CON COMPRA
    private void ListarProductos() {
        atxtReporteProductos.append("PRODUCTOS\n");
        for (int i = 0; i < prodDAO.ListarProductos().size(); i++) {
            atxtReporteProductos.append("* " + prodDAO.ListarProductos().get(i) + "\n");
        }
    }

    private void TotalAPagarCompra() {
        totalaPagarVenta = 0.0;

        List list = prodProforma.MostrarProductos();

        double monto = totalaPagarVenta;

        Producto prodCompra;

        for (int i = 0; i < list.size(); i++) {

            prodCompra = (Producto) list.get(i);

            double precio = Double.parseDouble(String.valueOf(prodCompra.getPrecio()));
            int cantidad = Integer.parseInt(String.valueOf(prodCompra.getStock()));

            System.out.println(precio * cantidad);

            monto += (precio * cantidad);

        }

        txtTotalVenta.setText(String.format("%.2f", totalaPagarVenta));
    }

    private int IdDeCompra() {
        List list = compraDAO.ListarCompras();
        Compra obj;
        for (int i = 0; i < compraDAO.ListarCompras().size(); i++) {
            obj = (Compra) list.get(i);
            idCompra = obj.getId() + 1;
        }
        return idCompra;
    }

    //VENTA DE PRODUCTO
    //***TOTAL A PAGAR CON VENTA
    private void ListarProductoVentaIdCBX() {
        cbxProductoVenta.removeAllItems();
        Producto producto;
        for (int i = 0; i < prodDAO.ListarProductos().size(); i++) {
            producto = (Producto) prodDAO.ListarProductos().get(i);
            cbxProductoVenta.addItem(String.valueOf(producto.getCodigo()));
        }
    }

    private int IdDeVenta() {
        List list = ventaDAO.ListarVentas();
        Venta obj;

        for (int i = 0; i < ventaDAO.ListarVentas().size(); i++) {
            obj = (Venta) list.get(i);
            idVenta = obj.getId() + 1;
        }
        return idVenta;
    }

    private void TotalAPagarVenta() {

        totalaPagarVenta = 0.0;

        List list = detalleProformaVenta.MostrarProductos();

        double monto = totalaPagarVenta;

        DetalleVenta dv;

        for (int i = 0; i < list.size(); i++) {

            dv = (DetalleVenta) list.get(i);

            double precio = Double.parseDouble(String.valueOf(dv.getPrecio()));
            int cantidad = Integer.parseInt(String.valueOf(dv.getCantidad()));

            monto += (precio * cantidad);
        }

        totalaPagarVenta = monto;

        txtTotalVenta.setText(String.format("%.2f", totalaPagarVenta));
    }

    private void RegistrarCompra() {
        /*String cliente = txtNombreClienteVenta.getText();
        String remitente = lblConectado.getText();
        
        
        compra.setCliente(cliente);
        compra.setVendedor(remitente);
        compra.setTotal(monto);
        
        vDAO.RegistrarVenta(v);*/
    }

    private void RegistrarDetalleVenta() {
        /*
        for (int i = 0; i < tblVenta.getRowCount(); i++) {
            String cod = tblVenta.getValueAt(i, 0).toString();
            int cantidad = Integer.parseInt(tblVenta.getValueAt(i, 2).toString());
            double precio = Double.parseDouble(tblVenta.getValueAt(i, 3).toString());
            int id = 1;
            
            detVenta.setCod_pro(cod);
            detVenta.setCantidad(cantidad);
            detVenta.setPrecio(precio);     
            
            detVenta.setId(1);
            
            vDAO.RegistrarDetalle(detVenta);
        }
         */
    }

    //CODIGOCOMPRALISTAPRODUCTO      
    private void btnAgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVentaActionPerformed
        //
        int id = 0;
        String codigo = "";
        String proveedor = "";
        String desc = "";
        int cantidad = 0;
        double precio = 0.0;
        int id_compra = 0;
        //
        if ("".equals(cbxProductoVenta.getSelectedItem().toString())
                || "".equals(txtCntVentaProd.getText().toString())
                || "".equals(txtDescVentaProd.getText().toString())
                || "".equals(txtPrecioVentaProd.getText().toString())) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            DetalleVenta dv = new DetalleVenta();

            dv.setCodproducto(cbxProductoVenta.getSelectedItem().toString());
            dv.setCantidad(Integer.parseInt(txtCntVentaProd.getText().toString()));
            dv.setPrecio(Double.parseDouble(txtPrecioVentaProd.getText().toString()));
            dv.setId_venta(Integer.parseInt(txtCodVentaProd.getText().toString()));

            detalleProformaVenta.Agregar(dv);
            //
            atxtVenta.append(dv.toString() + "\n");
        }
    }//GEN-LAST:event_btnAgregarVentaActionPerformed

    private void btnImprimirVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirVentaActionPerformed
        txtCodVentaProd.setText(String.valueOf(IdDeVenta()));
        TotalAPagarVenta();

        //txtIdProd.setText(String.valueOf(venta.getId()));        
        venta.setRemitente(lblConectado.getText().toString());
        venta.setCliente(txtNombreClienteVenta.getText().toString());
        venta.setPreciototal(totalaPagarVenta);

        ventaDAO.RegistrarVenta(venta);

    }//GEN-LAST:event_btnImprimirVentaActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed

        if ("".equals(txtDniCliente.getText().toString())
                || "".equals(txtNombreCliente.getText().toString())
                || "".equals(Integer.parseInt(txtTelCliente.getText().toString()))
                || "".equals(txtDireccionCliente.getText().toString())
                || "".equals(txtRazonCliente.getText().toString())) {

            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);

        } else {

            cl.setDni(Integer.parseInt(txtDniCliente.getText()));
            cl.setEstado("activo");
            cl.setNombre(txtNombreCliente.getText());
            cl.setTelefono(Integer.parseInt(txtTelCliente.getText()));
            cl.setDireccion(txtDireccionCliente.getText());
            cl.setRazon(txtRazonCliente.getText());

            clDAO.registrarCliente(cl);

            JOptionPane.showMessageDialog(null, "Cliente registrado");

            LimpiarCliente();
            ListarClienteIdCBX();
            ListarClienteReporte();
        }
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnLimpiarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarClienteActionPerformed
        LimpiarCliente();
    }//GEN-LAST:event_btnLimpiarClienteActionPerformed

    private void btnRegistrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProdActionPerformed
        //PRODUCTO        
        if ("".equals(txtDescProd.getText().toString())
                || "".equals(txtCantProd.getText().toString())
                || "".equals(txtPrecioProd.getText().toString())) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);

        } else {

            codigoProducto = "PD-00"
                    + CodigoDesc(txtDescProd.getText().toString(), 5)
                    + CodigoDesc(cbxProvProd.getSelectedItem().toString(), 3);

            Producto producto = new Producto(
                    Integer.parseInt(txtIdProd.getText().toString()),
                    codigoProducto,
                    txtDescProd.getText().toString(),
                    cbxProvProd.getSelectedItem().toString(),
                    Integer.parseInt(txtCantProd.getText().toString()),
                    Double.parseDouble(txtPrecioProd.getText().toString()),
                    Integer.parseInt(txtIdCompra.getText().toString()));

            txtCodigoProducto.setText(codigoProducto);

            prodProforma.Agregar(producto);
            //atxtReporteProductos.setText(null);
            atxtListaProductos.setText(null);

            for (int i = 0; i < prodProforma.MostrarProductos().size(); i++) {
                atxtListaProductos.append("* " + prodProforma.MostrarProductos().get(i) + "\n");
            }

            idProducto++;
            txtIdProd.setText(String.valueOf(idProducto));
        }
    }//GEN-LAST:event_btnRegistrarProdActionPerformed

    private void btnNuevoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProdActionPerformed
        LimpiarProducto();
    }//GEN-LAST:event_btnNuevoProdActionPerformed

    private void btnLimpiarVentaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarVentaProductoActionPerformed
        LimpiarVenta();
    }//GEN-LAST:event_btnLimpiarVentaProductoActionPerformed

    private void jbtnNVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNVentaActionPerformed
        LimpiarCLienteEnVenta();
        cbxcodigoProducto.setVisible(false);
        btnActualizarCodProducto.setVisible(false);
        jtbdPanelGral.setSelectedIndex(0);
    }//GEN-LAST:event_jbtnNVentaActionPerformed

    private void jbtnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClienteActionPerformed
        ClienteController clienteController = new ClienteController();
        btnActualizarIDClientes.setVisible(true);
        cbxIdClientes.removeAllItems();
        List<Cliente> clientes = clienteController.listarClientes();
        //Cliente cliente;
        for (Cliente c : clientes) {
            cbxIdClientes.addItem(String.valueOf(c.getId()));
            atxtReporteCliente.append(String.valueOf(c.getId()) + "\n");
        }
        btnActualizarCliente.setVisible(false);
        btnEliminarCliente.setVisible(false);
        jtbdPanelGral.setSelectedIndex(1);
    }//GEN-LAST:event_jbtnClienteActionPerformed

    private void jbtnProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProvActionPerformed
        btnActualizarProvProd.setVisible(true);
        cbxcodigoProducto.setVisible(false);
        btnActualizarCodProducto.setVisible(false);
        //
        btnActualizarProveedor.setVisible(false);
        btnEliminarProveedor.setVisible(false);
        ListarProveedorIdCBX();
        ListarProveedorReporte();

        jtbdPanelGral.setSelectedIndex(2);
    }//GEN-LAST:event_jbtnProvActionPerformed

    private void btnProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdActionPerformed
        cbxcodigoProducto.removeAllItems();
        cbxcodigoProducto.setVisible(false);
        btnActualizarCodProducto.setVisible(false);
        btnModificarProd.setVisible(false);
        ListarProductos();
        ListarProveedorCompraIdCBX();

        txtRemitenteCompra.setText(lblConectado.getText().toString());
        jtbdPanelGral.setSelectedIndex(3);
    }//GEN-LAST:event_btnProdActionPerformed

    private void btnActualizarIDClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarIDClientesActionPerformed
        ListarClienteVentaIdCBX();
    }//GEN-LAST:event_btnActualizarIDClientesActionPerformed

    private void btnAgregarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProvActionPerformed

        if (!"".equals(txtRucProv.getText()) || !"".equals(txtDescProv.getText()) || !"".equals(txtTelProv.getText()) || !"".equals(txtDirProv.getText()) || !"".equals(txtRazProv.getText())) {
            prov.setRuc(Integer.parseInt(txtRucProv.getText()));
            prov.setNombre(txtDescProv.getText());
            prov.setTelefono(Integer.parseInt(txtTelProv.getText()));
            prov.setDireccion(txtDirProv.getText());
            prov.setRazon(txtRazProv.getText());

            provDAO.registrarProveedor(prov);
            JOptionPane.showMessageDialog(null, "Proveedor guardado.");

            LimpiarProveedor();
            ListarProveedorReporte();
            ListarProveedorIdCBX();
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios.");
        }
    }//GEN-LAST:event_btnAgregarProvActionPerformed

    private void btnLimpiarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProvActionPerformed
        LimpiarProveedor();
    }//GEN-LAST:event_btnLimpiarProvActionPerformed

    private void btnActualizarProvProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProvProdActionPerformed
        ListarProveedorCompraIdCBX();
    }//GEN-LAST:event_btnActualizarProvProdActionPerformed

    private void btnImprimirCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirCompraActionPerformed
        //PRODUCTO EN FIN FACTURA DETALLECOMPRA
        double total = 0;
        int cant = 0;
        //PRODUCTO AGREGADO A COMPRA
        TotalAPagarCompra();
        //
        txtIdProd.setText(String.valueOf(compra.getId()));
        //int i;
        //
        compra.setRemitente(lblConectado.getText().toString());
        compra.setProveedor(cbxProvProd.getSelectedItem().toString());
        compra.setPreciototal(totalaPagar);
        compra.setPreciomovil(Double.parseDouble(txtPrecioMovil.getText().toString()));
        compra.setMovil(txtMovil.getText().toString());

        compraDAO.RegistrarCompra(compra);

        //PRODUCTO AGREGADO A detalleCOMPRA
        List list = prodProforma.MostrarProductos();
        Producto productoDV;

        for (int i = 0; i < prodProforma.MostrarProductos().size(); i++) {
            productoDV = (Producto) list.get(i);

            detalleCompra.setCodproducto(productoDV.getCodigo());
            detalleCompra.setCantidad(productoDV.getStock());
            detalleCompra.setPrecio(productoDV.getPrecio());
            detalleCompra.setId_compra(Integer.parseInt(txtIdCompra.getText().toString()));

            compraDAO.RegistrarDetalle(detalleCompra);
        }
        //PRODUCTO AGREGADO A INVENTARIO
        for (int i = 0; i < prodProforma.MostrarProductos().size(); i++) {
            prodAgregado.setCodigo(prodProforma.getListaProductos().get(i).getCodigo());
            prodAgregado.setNombre(prodProforma.getListaProductos().get(i).getNombre());
            prodAgregado.setProveedor(prodProforma.getListaProductos().get(i).getProveedor());
            prodAgregado.setStock(prodProforma.getListaProductos().get(i).getStock());
            prodAgregado.setPrecio(prodProforma.getListaProductos().get(i).getPrecio());
            prodAgregado.setId_compra(Integer.parseInt(txtIdCompra.getText().toString()));

            prodDAO.RegistrarProductos(prodAgregado);
        }
        //REPORTES
        atxtReporteCompraFinal.append("*****\n");
        for (int i = 0; i < prodProforma.MostrarProductos().size(); i++) {
            atxtReporteCompraFinal.append("* " + prodProforma.MostrarProductos().get(i) + "\n");
            atxtReporteCompraFinal.append("* " + compraDAO.ListarDetalleCompra().get(i) + "\n");
        }
        //
        atxtReporteProductos.setText("null");
        ListarProductos();
        //
        txtIdCompra.setText(String.valueOf(IdDeCompra()));
        //       
        LimpiarProducto();
        //
        atxtListaProductos.setText(null);
    }//GEN-LAST:event_btnImprimirCompraActionPerformed

    private void btnActualizarCodProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCodProductoActionPerformed

    }//GEN-LAST:event_btnActualizarCodProductoActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        cbxcodigoProducto.removeAllItems();
        cbxcodigoProducto.setVisible(true);

        btnActualizarCodProducto.setVisible(true);
        btnRegistrarProd.setVisible(false);
        btnModificarProd.setVisible(true);

        txtIdProd.setVisible(false);
        lblIdProducto.setVisible(false);
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void cbxcodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxcodigoProductoActionPerformed

    }//GEN-LAST:event_cbxcodigoProductoActionPerformed

    private void btnModificarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProdActionPerformed

    }//GEN-LAST:event_btnModificarProdActionPerformed

    private void btnActualizarCodProductoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCodProductoVentaActionPerformed
        ListarProductoVentaIdCBX();
    }//GEN-LAST:event_btnActualizarCodProductoVentaActionPerformed

    private void btnActualizarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProveedorActionPerformed

        if ("".equals(txtRucProv.getText()) || "".equals(txtDescProv.getText()) || !"".equals(txtTelProv.getText()) || !"".equals(txtDirProv.getText()) || !"".equals(txtRazProv.getText())) {
            prov.setRuc(Integer.parseInt(txtRucProv.getText()));
            prov.setNombre(txtDescProv.getText());
            prov.setTelefono(Integer.parseInt(txtTelProv.getText()));
            prov.setDireccion(txtDirProv.getText());
            prov.setRazon(txtRazProv.getText());
            prov.setId(Integer.parseInt(cbxIdProveedores.getSelectedItem().toString()));

            provDAO.ModificarProveedor(prov);

            JOptionPane.showMessageDialog(null, "Proveedor editado");

            ListarProveedorReporte();
            LimpiarProveedor();
        } else {
            System.out.println("Debe rellenar al proveedor");
        }
    }//GEN-LAST:event_btnActualizarProveedorActionPerformed

    private void btnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClienteActionPerformed
        if (!"".equals(txtDniCliente.getText()) || !"".equals(txtNombreCliente.getText()) || !"".equals(txtTelCliente.getText()) || !"".equals(txtDireccionCliente.getText())) {
            cl.setDni(Integer.parseInt(txtDniCliente.getText()));
            cl.setNombre(txtNombreCliente.getText());
            cl.setEstado("activo");
            cl.setTelefono(Integer.parseInt(txtTelCliente.getText()));
            cl.setDireccion(txtDireccionCliente.getText());
            cl.setRazon(txtRazonCliente.getText());
            cl.setId(Integer.parseInt(cbxIdClientes.getSelectedItem().toString()));

            clDAO.ModificarCliente(cl);

            JOptionPane.showMessageDialog(null, "Cliente editado.");

            LimpiarCliente();
            ListarClienteReporte();
        } else {
            System.out.println("Debe rellenar todos");
        }
    }//GEN-LAST:event_btnActualizarClienteActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        if (!"".equals(cbxIdProveedores.getSelectedItem().toString())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar proveedor?");
            if (pregunta == 0) {
                int id = Integer.parseInt(cbxIdProveedores.getSelectedItem().toString());
                provDAO.EliminarProveedor(id);
                ListarProveedorReporte();
                ListarProveedorIdCBX();
                LimpiarProveedor();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila.");
        }
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        if (!"".equals(cbxIdClientes.getSelectedItem().toString())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "esta seguro de eliminar?");

            if (pregunta == 0) {
                int id = Integer.parseInt(cbxIdClientes.getSelectedItem().toString());
                clDAO.EliminarCliente(id);
                LimpiarCliente();
                ListarClienteIdCBX();
                ListarClienteReporte();
            }
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void chbxEscogerIDClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxEscogerIDClientesMouseClicked

        if (chbxEscogerIDClientes.isSelected()) {
            btnActualizarCliente.setVisible(true);
            btnEliminarCliente.setVisible(true);
        } else {
            btnActualizarCliente.setVisible(false);
            btnEliminarCliente.setVisible(false);
        }
    }//GEN-LAST:event_chbxEscogerIDClientesMouseClicked

    private void cbxIdClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxIdClientesMouseClicked
        /*int id = Integer.parseInt(cbxIdClientes.getSelectedItem().toString());

        Cliente cliente;

        for (int i = 0; i < clDAO.ListarCliente().size(); i++) {
            cliente = (Cliente) clDAO.ListarCliente().get(i);

            if (cliente.getId() == id) {
                txtNombreCliente.setText(cliente.getNombre());
                txtDniCliente.setText(String.valueOf(cliente.getDni()));
                txtDireccionCliente.setText(cliente.getDireccion());
                txtTelCliente.setText(String.valueOf(cliente.getTelefono()));
                txtRazonCliente.setText(cliente.getRazon());
            } else {
                System.out.println("No existe id cliente");
            }
        }*/
    }//GEN-LAST:event_cbxIdClientesMouseClicked

    private void cbxIdProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxIdProveedoresMouseClicked
        int id = Integer.parseInt(cbxIdProveedores.getSelectedItem().toString());

        Proveedor proveedor;

        for (int i = 0; i < provDAO.ListarProveedor().size(); i++) {
            proveedor = (Proveedor) provDAO.ListarProveedor().get(i);

            if (proveedor.getId() == id) {
                txtDescProv.setText(proveedor.getNombre());
                txtRucProv.setText(String.valueOf(proveedor.getRuc()));
                txtDirProv.setText(proveedor.getDireccion());
                txtTelProv.setText(String.valueOf(proveedor.getTelefono()));
                txtRazProv.setText(proveedor.getRazon());
            } else {
                System.out.println("No existe id proveedor");
            }
        }
    }//GEN-LAST:event_cbxIdProveedoresMouseClicked

    private void chbxElegirIDProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxElegirIDProveedorMouseClicked
        if (chbxElegirIDProveedor.isSelected()) {
            btnActualizarProveedor.setVisible(true);
            btnEliminarProveedor.setVisible(true);
        } else {
            btnActualizarProveedor.setVisible(false);
            btnEliminarProveedor.setVisible(false);
        }
    }//GEN-LAST:event_chbxElegirIDProveedorMouseClicked

    private void cbxIdClienteVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxIdClienteVentaMouseClicked
        int id = Integer.parseInt(cbxIdClienteVenta.getSelectedItem().toString());
        Cliente cliente;

        for (int i = 0; i < clDAO.ListarCliente().size(); i++) {
            cliente = (Cliente) clDAO.ListarCliente().get(i);

            if (cliente.getId() == id) {
                txtNombreClienteVenta.setText(cliente.getNombre());
                txtTelefonoClienteVenta.setText(String.valueOf(cliente.getTelefono()));
                txtDireccionClienteVenta.setText(cliente.getDireccion());
            } else {
                System.out.println("No existe id cliente");
            }
        }
        //        
    }//GEN-LAST:event_cbxIdClienteVentaMouseClicked

    private void btnLimpiarClienteVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarClienteVentaActionPerformed
        LimpiarCLienteEnVenta();
    }//GEN-LAST:event_btnLimpiarClienteVentaActionPerformed

    private void cbxProductoVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxProductoVentaMouseClicked
        List list = prodDAO.ListarProductos();
        Producto producto;

        for (int i = 0; i < list.size(); i++) {
            producto = (Producto) list.get(i);
            if (cbxProductoVenta.getSelectedItem().toString().equals(producto.getCodigo())) {
                txtDescVentaProd.setText(producto.getNombre());
                txtStockDispProd.setText(String.valueOf(producto.getStock()));
                txtPrecioVentaProd.setText(String.valueOf(producto.getPrecio()));
            } else {
                System.out.println("No hay contenido para el producto");
            }
        }
    }//GEN-LAST:event_cbxProductoVentaMouseClicked

    private void cbxIdClientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxIdClientesItemStateChanged
        ClienteController clienteController = new ClienteController();
        int id = Integer.parseInt(cbxIdClientes.getSelectedItem().toString());
        //cbxIdClientes.removeAllItems();
        List<Cliente> clientes = clienteController.listarClientes();
        //Cliente cliente;
        for (Cliente c : clientes) {
            if(cbxIdClientes.getSelectedItem().toString().equalsIgnoreCase(String.valueOf(c.getId())))
            System.out.println("c->"  + c.getId());
        }
        
        
        Cliente cliente;

        for (int i = 0; i < clDAO.ListarCliente().size(); i++) {
            cliente = (Cliente) clDAO.ListarCliente().get(i);

            if (cliente.getId() == id) {
                txtNombreCliente.setText(cliente.getNombre());
                txtDniCliente.setText(String.valueOf(cliente.getDni()));
                txtDireccionCliente.setText(cliente.getDireccion());
                txtTelCliente.setText(String.valueOf(cliente.getTelefono()));
                txtRazonCliente.setText(cliente.getRazon());
            } else {
                System.out.println("No existe id cliente");
            }
        }
    }//GEN-LAST:event_cbxIdClientesItemStateChanged

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxtListaProductos;
    private javax.swing.JTextArea atxtReporte;
    private javax.swing.JTextArea atxtReporteCliente;
    private javax.swing.JTextArea atxtReporteCompraFinal;
    private javax.swing.JTextArea atxtReporteProductos;
    private javax.swing.JTextArea atxtReporteProv;
    private javax.swing.JTextArea atxtVenta;
    private javax.swing.JButton btnActualizarCliente;
    private javax.swing.JButton btnActualizarCodProducto;
    private javax.swing.JButton btnActualizarCodProductoVenta;
    private javax.swing.JButton btnActualizarIDClientes;
    private javax.swing.JButton btnActualizarProvProd;
    private javax.swing.JButton btnActualizarProveedor;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarProv;
    private javax.swing.JButton btnAgregarVenta;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnImprimirCompra;
    private javax.swing.JButton btnImprimirVenta;
    private javax.swing.JButton btnLimpiarCliente;
    private javax.swing.JButton btnLimpiarClienteVenta;
    private javax.swing.JButton btnLimpiarProv;
    private javax.swing.JButton btnLimpiarVentaProducto;
    private javax.swing.JButton btnModificarProd;
    private javax.swing.JButton btnNuevoProd;
    private javax.swing.JButton btnProd;
    private javax.swing.JButton btnRegistrarProd;
    private javax.swing.JComboBox<String> cbxIdClienteVenta;
    private javax.swing.JComboBox<String> cbxIdClientes;
    private javax.swing.JComboBox<String> cbxIdProveedores;
    private javax.swing.JComboBox<String> cbxProductoVenta;
    private javax.swing.JComboBox<String> cbxProvProd;
    private javax.swing.JComboBox<String> cbxcodigoProducto;
    private javax.swing.JCheckBox chbxElegirIDProveedor;
    private javax.swing.JCheckBox chbxEscogerIDClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton jbtnCliente;
    private javax.swing.JButton jbtnNVenta;
    private javax.swing.JButton jbtnProv;
    private javax.swing.JTabbedPane jtbdPanelGral;
    public javax.swing.JLabel lblConectado;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdProducto;
    private javax.swing.JTextField txtCantProd;
    private javax.swing.JLabel txtCantidadDisponibleProd;
    private javax.swing.JTextField txtCntVentaProd;
    private javax.swing.JTextField txtCodVentaProd;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDescProd;
    private javax.swing.JTextField txtDescProv;
    private javax.swing.JTextField txtDescVentaProd;
    private javax.swing.JTextField txtDirProv;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDireccionClienteVenta;
    private javax.swing.JTextField txtDniCliente;
    private javax.swing.JTextField txtIdCompra;
    private javax.swing.JTextField txtIdProd;
    private javax.swing.JTextField txtMovil;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreClienteVenta;
    private javax.swing.JFormattedTextField txtPrecioMovil;
    private javax.swing.JTextField txtPrecioProd;
    private javax.swing.JTextField txtPrecioVentaProd;
    private javax.swing.JTextField txtRazProv;
    private javax.swing.JTextField txtRazonCliente;
    private javax.swing.JTextField txtRemitenteCompra;
    private javax.swing.JTextField txtRucProv;
    private javax.swing.JTextField txtStockDispProd;
    private javax.swing.JTextField txtTelCliente;
    private javax.swing.JTextField txtTelProv;
    private javax.swing.JTextField txtTelefonoClienteVenta;
    private javax.swing.JTextField txtTotalAPagar;
    private javax.swing.JFormattedTextField txtTotalVenta;
    // End of variables declaration//GEN-END:variables
}
