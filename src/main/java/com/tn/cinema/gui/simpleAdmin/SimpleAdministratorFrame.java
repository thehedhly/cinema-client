package com.tn.cinema.gui.simpleAdmin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.alee.laf.WebLookAndFeel;
import com.alee.laf.label.WebLabel;
import com.alee.laf.panel.WebPanel;
import com.alee.laf.tabbedpane.WebTabbedPane;
import com.tn.cinema.gui.xPanl;

public class SimpleAdministratorFrame extends JFrame {

	private WebPanel contentPane;

	static WebTabbedPane menuTPane;
	JPanel userDetailsPanel;
	JLabel lblManagers;
	JLabel lblMovies;
	JLabel lblTheaters;
	JLabel lblSessions;
	JLabel lblStats;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				WebLookAndFeel.install();
				try {
					SimpleAdministratorFrame frame = new SimpleAdministratorFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SimpleAdministratorFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 549);
		setResizable(false);
		contentPane = new WebPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// userDetailsPane
		userDetailsPanel = new JPanel();
		userDetailsPanel.setBounds(5, 5, 777, 111);
		userDetailsPanel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		contentPane.add(userDetailsPanel);
		
		// tabbedPanes
		menuTPane = new WebTabbedPane();
		menuTPane.setBounds(5, 127, 777, 384);
		menuTPane.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		menuTPane.setPreferredSize(new Dimension(170, 120));
		menuTPane.setTabPlacement(WebTabbedPane.LEFT);
		setupTabbedPane(menuTPane);

		// managers pane
		lblManagers = new JLabel("Managers");
		lblManagers.setIcon(new ImageIcon(getClass().getResource("/images/managers.png")));
		lblManagers.setPreferredSize(new Dimension(140, 53));
		menuTPane.setTabComponentAt(0, lblManagers);

		// movies pane
		lblMovies = new JLabel("Movies");
		lblMovies.setIcon(new ImageIcon(getClass().getResource("/images/movies.png")));
		lblMovies.setPreferredSize(new Dimension(140, 55));
		menuTPane.setTabComponentAt(1, lblMovies);

		// movie theaters pane
		lblTheaters = new JLabel("Movie Theaters");
		lblTheaters.setIcon(new ImageIcon(getClass().getResource("/images/theaters.png")));
		lblTheaters.setPreferredSize(new Dimension(140, 53));
		menuTPane.setTabComponentAt(2, lblTheaters);

		// sessions pane
		lblSessions = new JLabel("Movies Sessions ");
		lblSessions.setIcon(new ImageIcon(getClass().getResource("/images/sessions.png")));
		lblSessions.setPreferredSize(new Dimension(140, 53));
		menuTPane.setTabComponentAt(3, lblSessions);
		// lblStats stats pane
		lblStats = new JLabel("Stats");
		lblStats.setIcon(new ImageIcon(getClass().getResource("/images/stats.png")));
		lblStats.setPreferredSize(new Dimension(140, 53));
		menuTPane.setTabComponentAt(4, lblStats);

		contentPane.add(menuTPane);
	}

	private static void setupTabbedPane(JTabbedPane tabbedPane) {

		tabbedPane.addTab("Disabled 2", new xPanl());
		tabbedPane.addTab("Selected 3", new WebLabel());

		tabbedPane.addTab("Colored 4", new WebLabel());
		tabbedPane.addTab("Normal 4", new xPanl());
		tabbedPane.addTab("Normal 5", new xPanl());
	}

	
}
