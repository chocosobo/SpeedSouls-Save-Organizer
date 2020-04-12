package com.speedsouls.organizer.hotkeys;


import com.speedsouls.organizer.data.OrganizerManager;
import com.speedsouls.organizer.savelist.Save;


/**
 * Global Hotkey Enum.
 * <p>
 * Enum representing the different global hotkeys and their actions.
 *
 * @author Kahmul (www.twitch.tv/kahmul78)
 * @date 4 Jun 2016
 */
public enum GlobalHotkey
{

	LOAD_SAVE("선택한 세이브 불러오기:", "지정되지 않음")
	{

		@Override
		public void action()
		{
			if (OrganizerManager.getSelectedEntry() instanceof Save)
				OrganizerManager.loadSave((Save) OrganizerManager.getSelectedEntry());
		}


		@Override
		public String getPrefsKey()
		{
			return OrganizerManager.PREFS_KEY_GLOBAL_HOTKEY_LOAD;
		}
	},
	READ_ONLY_TOGGLE("파일을 읽기 전용으로 수정:", "지정되지 않음")
	{

		@Override
		public void action()
		{
			OrganizerManager.switchCurrentGameFileWritableState();
		}


		@Override
		public String getPrefsKey()
		{
			return OrganizerManager.PREFS_KEY_GLOBAL_HOTKEY_READ_ONLY;
		}
	},
	GLOBAL_HOTKEY_TOGGLE("글로벌 단축기 토글:", "지정되지 않음")
	{

		@Override
		public void action()
		{
			OrganizerManager.setGlobalHotkeysEnabled(!OrganizerManager.areGlobalHotkeysEnabled());
		}


		@Override
		public String getPrefsKey()
		{
			return OrganizerManager.PREFS_KEY_GLOBAL_HOTKEY_TOGGLE;
		}
	};

	private String caption;
	private String keyCode;


	/**
	 * Creates a new GlobalHotkey constant.
	 * 
	 * @param caption the name of the hotkey which is displayed in the settings window
	 * @param keyCode the associated key code on which the hotkey action will be executed
	 */
	private GlobalHotkey(String caption, String keyCode)
	{
		setCaption(caption);
		this.keyCode = keyCode;
	}


	/**
	 * The action to perform on pressing the hotkey.
	 */
	public abstract void action();


	public abstract String getPrefsKey();


	/**
	 * @return the caption
	 */
	public String getCaption()
	{
		return caption;
	}


	/**
	 * @param caption the caption to set
	 */
	public void setCaption(String caption)
	{
		this.caption = caption;
	}


	/**
	 * @return the keyCode
	 */
	public String getKeyCode()
	{
		String storedCode = OrganizerManager.getStoredHotkeyCode(this);
		return "".equals(storedCode) ? keyCode : storedCode;

	}


	/**
	 * @param keyCode the keyCode to set
	 */
	public void setKeyCode(String keyCode)
	{
		this.keyCode = keyCode;
		OrganizerManager.setStoredHotkeyCode(this, keyCode);
	}
}
