package com.speedsouls.organizer.profileconfig;


import java.io.File;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.speedsouls.organizer.data.OrganizerManager;
import com.speedsouls.organizer.games.Game;


/**
 * Directory part of the configuration window.
 * <p>
 * Contains the directory field as well as the browse button.
 *
 * @author Kahmul (www.twitch.tv/kahmul78)
 * @date 28 Sep 2015
 */
public class GameConfigDirectoryPanel extends JPanel
{

	private static final long serialVersionUID = 3869667597583441534L;


	/**
	 * Creates a new directory panel.
	 * 
	 * @param game the game of this panel
	 */
	protected GameConfigDirectoryPanel(Game game)
	{
		GroupLayout layout = new GroupLayout(this);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		File saveFile = game.getSaveFileLocation();
		File gameDir = game.getDirectory();

		JLabel saveFileLabel = new JLabel("세이브 파일 위치:");
		JLabel directoryLabel = new JLabel("프로파일 위치:");

		JTextField saveFileField = new JTextField(saveFile != null ? saveFile.getPath() : "");
		JTextField directoryField = new JTextField(gameDir != null ? gameDir.getPath() : "");

		JButton saveFileBrowseButton = createSaveFileBrowseButton(saveFileField, directoryField, game);
		JButton directoryBrowseButton = createDirectoryBrowseButton(directoryField, game);

		saveFileField.setEditable(false);
		directoryField.setEditable(false);

		// Horizontal
		GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();

		hGroup.addGroup(layout.createParallelGroup().addComponent(saveFileLabel).addComponent(saveFileField).addComponent(directoryLabel)
				.addComponent(directoryField));
		hGroup.addGroup(layout.createParallelGroup().addComponent(saveFileBrowseButton).addComponent(directoryBrowseButton));

		layout.setHorizontalGroup(hGroup);

		// Vertical
		GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();

		vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(saveFileLabel));

		vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(saveFileField).addComponent(saveFileBrowseButton));

		vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(directoryLabel));

		vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(directoryField).addComponent(directoryBrowseButton));

		layout.setVerticalGroup(vGroup);

		setLayout(layout);
	}


	/**
	 * @param saveFileField
	 * @param game
	 * @return
	 */
	private JButton createSaveFileBrowseButton(JTextField saveFileField, JTextField directoryField, Game game)
	{
		JButton browseButton = new JButton("찾기");

		browseButton.addActionListener(event -> {
			JFileChooser fc = new JFileChooser(saveFileField.getText());
			fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
			int val = fc.showOpenDialog(null);
			if (val == JFileChooser.APPROVE_OPTION)
			{
				File selectedSavefile = fc.getSelectedFile();
				if (selectedSavefile == null || !selectedSavefile.exists())
				{
					JOptionPane.showMessageDialog(null, "이 파일은 존재하지 않습니다!", "에러 발생", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if (selectedSavefile.getName().equalsIgnoreCase(game.getSaveName()))
				{
					game.setSaveFileLocation(selectedSavefile);
					saveFileField.setText(selectedSavefile.getPath());
					int confirm = JOptionPane.showConfirmDialog(getParent(),
							"이 세이브 파일 위치를 프로파일 저장 위치로 지정합니까??"
									+ " 원한다면 다른 폴더를 지정할 수 있습니다.",
							"세이브 파일 선택중", JOptionPane.YES_NO_OPTION);
					if (confirm == 0)
					{
						directoryField.setText(selectedSavefile.getParentFile().getPath());
						game.setDirectory(selectedSavefile.getParentFile());
						OrganizerManager.saveProperties(game);
						OrganizerManager.fireProfileDirectoryChangedEvent(game);
						return;
					}
					OrganizerManager.saveProperties(game);
					return;
				}
				JOptionPane.showMessageDialog(null, "파일 명은 반드시 '" + game.getSaveName() + "' 여야 합니다!", "에러 발생",
						JOptionPane.ERROR_MESSAGE);
			}
		});
		return browseButton;
	}


	/**
	 * Creates the browse button.
	 * 
	 * @param directoryField the directory field of this panel
	 * @param game the game associated with this panel
	 * @return the browse button
	 */
	private JButton createDirectoryBrowseButton(JTextField directoryField, Game game)
	{
		JButton browseButton = new JButton("찾기");

		browseButton.addActionListener(event -> {
			if (game.getSaveFileLocation() == null)
			{
				JOptionPane.showMessageDialog(null, "먼저 세이브 파일 위치를 지정해주세요!", "주의",
						JOptionPane.WARNING_MESSAGE);
				return;
			}
			JFileChooser fc = new JFileChooser(directoryField.getText());
			fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int val = fc.showOpenDialog(null);
			if (val == JFileChooser.APPROVE_OPTION)
			{
				File selectedDir = fc.getSelectedFile();
				if (selectedDir == null || !selectedDir.exists())
				{
					JOptionPane.showMessageDialog(null, "이 위치는 존재하지 않습니다!", "에러 발생", JOptionPane.ERROR_MESSAGE);
					return;
				}
				directoryField.setText(selectedDir.getPath());
				game.setDirectory(selectedDir);
				OrganizerManager.saveProperties(game);
				OrganizerManager.fireProfileDirectoryChangedEvent(game);
			}
		});
		return browseButton;
	}

}
