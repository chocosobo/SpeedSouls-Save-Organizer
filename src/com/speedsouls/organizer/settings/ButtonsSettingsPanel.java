package com.speedsouls.organizer.settings;


import java.awt.Component;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPanel;


/**
 * ButtonSettingsPanel.
 * <p>
 * Contains the Save and Cancel button.
 *
 * @author Kahmul (www.twitch.tv/kahmul78)
 * @date 4 Jun 2016
 */
public class ButtonsSettingsPanel extends JPanel
{

	private static final long serialVersionUID = -6763035231347610220L;


	/**
	 * Creates a new buttons settings panel.
	 *
	 * @param window the settings window
	 */
	protected ButtonsSettingsPanel(SettingsWindow window)
	{
		GroupLayout layout = new GroupLayout(this);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		JButton saveButton = createSaveButton(window);
		JButton cancelButton = createCancelButton(window);

		Component glue = Box.createHorizontalStrut(238);

		// Horizontal
		GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();

		hGroup.addComponent(glue).addComponent(saveButton).addComponent(cancelButton);

		layout.setHorizontalGroup(hGroup);

		// Vertical
		GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();

		vGroup.addGroup(
				layout.createParallelGroup(Alignment.TRAILING).addComponent(glue).addComponent(saveButton).addComponent(cancelButton));

		layout.setVerticalGroup(vGroup);

		setLayout(layout);
	}


	/**
	 * Creates the save button.
	 * 
	 * @param window the settings window
	 * @return the save button
	 */
	private JButton createSaveButton(SettingsWindow window)
	{
		JButton saveButton = new JButton("저장");
		saveButton.addActionListener(event -> {
			window.saveSettings();
			window.dispatchEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSING));
		});
		return saveButton;
	}


	/**
	 * Creates the cancel button.
	 * 
	 * @param window the settings window
	 * @return the cancel button
	 */
	private JButton createCancelButton(SettingsWindow window)
	{
		JButton cancelButton = new JButton("취소");
		cancelButton.addActionListener(event -> window.dispatchEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSING)));
		return cancelButton;
	}

}
