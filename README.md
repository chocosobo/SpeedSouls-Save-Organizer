[![Build Status](https://travis-ci.org/Kahmul/SpeedSouls-Save-Organizer.svg?branch=master)](https://travis-ci.org/Kahmul/SpeedSouls-Save-Organizer)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/0f60ad59931c4b6e9dc237286a386e36)](https://www.codacy.com/app/kahmul78/SpeedSouls-Save-Organizer?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Kahmul/SpeedSouls-Save-Organizer&amp;utm_campaign=Badge_Grade)

# <img src="https://github.com/chocosobo/SpeedSouls-Save-Organizer/blob/master/src/com/speedsouls/organizer/resources/SpeedSoulsFlameSmall.png"/> ���ǵ� �ҿ� - ���̺� ������

���ǵ� �ҿ� - ���̺� ������� ��ũ�ҿ� 1,����,2,���ö�,3 �� ���̺� ������ �����ϱ� ���� ������� ���Դϴ�. 

## ���

<p align="center">
    <img src="https://github.com/Kahmul/SpeedSouls-Save-Organizer/blob/master/docs/images/SaveOrganizerFeatures.png"/>
</p>

**1.** ���� �����ϱ�.

**2.** �������� �����ϱ�. (3)�� ���� ���� �����մϴ�.

**3.** �������� ���� �޴� ����. ���� ���̺� ���� ��ġ �����ϴµ��� ���Դϴ�.

**4.** ���õ� ���������� ��� ���̺� ���� ���. ������ ������ ������ �����ϼ���. �б� �������� ������ ������ ���������� ǥ�õ˴ϴ�.

**5.** ���� ���̺� ������ (4)�� ����Ʈ�� �߰��մϴ�. ���õ� ������ ��ü ����Ʈ�� �������� �߰��˴ϴ�.

**6.** (4)���� ���õ� ������ ���� ���̺꿡 ����� �մϴ�.

**7.** (4)���� ���õ� ���̺� ������ ���� ���̺�� ����� �մϴ�.

**8.** ���õ� ���̺� ������ �б� �������� �����ϰų� �����մϴ�. ���� ������ �б� �����̸� ȸ������ ���մϴ�.

**9.** ������ ��ũ�� ���ϴ�.

## �䱸 ���

- Java JRE 8 or higher

## �ٿ�ε�

[�ֽ� ����](https://github.com/chocosobo/SpeedSouls-Save-Organizer/releases)


## �����ϱ�

�� ���α׷��� ����ϱ⿡ �ռ� ���� ������ ���� �����ľ��մϴ�. ���� ������ �����ּ���.

1. ���α׷��� ó�� �����ϸ� Once you started the program, press 'Edit Profiles'.

2. In the window that now opens you have to choose the right tab depending on which game you want to make savefiles for.

3. Click 'Browse' and navigate to the directory where the game stores its savefile (e.g. for Dark Souls this would be "<User>/Documents/NBGI/DarkSouls/<SomeNumbers>").

4. Confirm the directory so that the path shows up in the textfield next to the button.

5. Now press 'New' to create a new profile for your game, name it whatever you'd like.

6. Now you can close the 'Profile Configuration' window.

7. Back in the main menu you can now choose the game and the profile you just set up and start making savefiles.


## Creating/Loading Savefiles

In order to make savefiles with the Save Organizer you have to first set it up as described in the Getting Started section. Follow these steps once you've done that:

1. Make sure you are not currently in-game with any of your characters. That means either in the Main Menu or that the game is closed.

2. If you want to make a savefile in a folder, create one by right-clicking the list and pressing 'Add Folder'. Then select the folder so that the next savefile will be put into it.

3. Press 'Import current savefile' to make a copy of the current game's savefile and put it into the list. If you have a folder or one of its subcontents selected the savefile will be imported into that folder.

4. You have now created a copy of the save with all your characters and their current state. Name it however you like.

5. If you wish to put the savefile into a different folder just select it and drag and drop it into a different folder. You can do this with entire folders as well, it doesn't have to be a single save.

6. If you wish to reload the savefile, simply make sure that you are out of the game with any characters (so either Main Menu or not in the game at all), and press the 'Load selected savefile' button. This will overwrite the game's current savefile with the save you've selected.

7. If you go into the load screen menu now you may notice that the characters will not show the info according to the save you just loaded unless you restart the game. This is simply because the game only checks for that info on start-up. If you load any of the characters though it will now load the correct one.



## Planned Features

- Cut/Paste functionality
- Dragging and dropping multiple saves at once


## Troubleshooting

- Make sure you use Java JRE 8.
- Make sure your _JAVA_OPTIONS environment variable is set to proper values.
- If you have problems starting up the program after you've already been using it there might be conflicting data between the registry entries and the actual data. In this case it might help to remove the registry entries of the Save Organizer (the following steps are for Windows):

        1. Press Windows + R.
        2. Enter "regedit".
        3. Navigate to "HKEY_CURRENT_USER\Software\JavaSoft\Prefs\com\speedsouls\organizer\prefs".
        4. Delete all entries.

## Credits

- DarK for making the intro splash screen for 1.4 onwards.
