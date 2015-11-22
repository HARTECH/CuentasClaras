import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class ViewHome extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	
	private JMenuBar jMenuBarSistema;
	private JMenu JMenuMembers;
	private JMenuItem JMenuItemMembersNew;
	private JMenuItem JMenuItemMembersAll;
	private JMenu JMenuGastos;
	private JMenuItem JMenuItemGastosNew;
	private JMenuItem JMenuItemGastosAll;
	private JMenu jMenuSalir;
	
	private JLabel jLabelMemberName;
	private JLabel jLabelMemberMail;
	private JLabel jLabelMemberBalance;
	private JTextField jTextFieldMemberName;
	private JTextField jTextFieldMemberMail;
//	private JTextField jTextFieldMemberBalance;
	private JButton jButtonMemberNew;

	private SistemaCC sistema;

	public static void main(String[] args) {
		ViewHome inst = new ViewHome();
		inst.setVisible(true);
	}

	public ViewHome() {
		super();
		initGUI();
		sistema = new SistemaCC();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jMenuBarSistema = new JMenuBar();
				setJMenuBar(jMenuBarSistema);
				jMenuBarSistema.setPreferredSize(new java.awt.Dimension(300, 25));
				{
					JMenuMembers = new JMenu();
					jMenuBarSistema.add(JMenuMembers);
					JMenuMembers.setText("Participantes");
					JMenuMembers.setPreferredSize(new java.awt.Dimension(100,22));
					JMenuMembers.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {

						}
					});
					{
						JMenuItemMembersNew = new JMenuItem();
						JMenuMembers.add(JMenuItemMembersNew);
						JMenuItemMembersNew.setText("Nuevo");
						JMenuItemMembersNew.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								
							}
						});
					}
					{
						JMenuItemMembersAll = new JMenuItem();
						JMenuMembers.add(JMenuItemMembersAll);
						JMenuItemMembersAll.setText("Ver Participantes");
						JMenuItemMembersAll.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								
							}
						});
					}
					JMenuGastos = new JMenu();
					jMenuBarSistema.add(JMenuGastos);
					JMenuGastos.setText("Gastos");
					JMenuGastos.setPreferredSize(new java.awt.Dimension(100,22));
					JMenuGastos.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {

						}
					});
					{
						JMenuItemGastosNew = new JMenuItem();
						JMenuGastos.add(JMenuItemGastosNew);
						JMenuItemGastosNew.setText("Nuevo");
						JMenuItemGastosNew.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								
							}
						});
					}
					{
						JMenuItemGastosAll = new JMenuItem();
						JMenuGastos.add(JMenuItemGastosAll);
						JMenuItemGastosAll.setText("Ver Gastos");
						JMenuItemGastosAll.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								
							}
						});
					}
					{
						jMenuSalir = new JMenu();
						jMenuBarSistema.add(jMenuSalir);
						jMenuSalir.setText("Salir");
						jMenuSalir.addMenuListener(new MenuListener() {
							public void menuSelected(MenuEvent evt) {
								System.exit(0);
							}

							public void menuDeselected(MenuEvent evt) {

							}

							public void menuCanceled(MenuEvent evt) {

							}
						});
					}
				}
			}
			
			pack();
			setSize(650, 350);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
