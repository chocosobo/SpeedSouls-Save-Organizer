[![Build Status](https://travis-ci.org/Kahmul/SpeedSouls-Save-Organizer.svg?branch=master)](https://travis-ci.org/Kahmul/SpeedSouls-Save-Organizer)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/0f60ad59931c4b6e9dc237286a386e36)](https://www.codacy.com/app/kahmul78/SpeedSouls-Save-Organizer?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Kahmul/SpeedSouls-Save-Organizer&amp;utm_campaign=Badge_Grade)

# <img src="https://github.com/chocosobo/SpeedSouls-Save-Organizer/blob/master/src/com/speedsouls/organizer/resources/SpeedSoulsFlameSmall.png"/> 스피드 소울 - 세이브 정리기

스피드 소울 - 세이브 정리기는 다크소울 1,리마,2,스꼴라,3 의 세이브 파일을 정리하기 위해 만들어진 툴입니다. 

## 기능

<p align="center">
    <img src="https://github.com/Kahmul/SpeedSouls-Save-Organizer/blob/master/docs/images/SaveOrganizerFeatures.png"/>
</p>

**1.** 게임 선택하기.

**2.** 프로파일 선택하기. (3)을 통해 생성 가능합니다.

**3.** 프로파일 설정 메뉴 열기. 게임 세이브 파일 위치 지정하는데도 쓰입니다.

**4.** 선택된 프로파일의 모든 세이브 파일 목록. 폴더를 생성해 파일을 정리하세요. 읽기 전용으로 설정된 파일은 아이콘으로 표시됩니다.

**5.** 현재 세이브 파일을 (4)의 리스트에 추가합니다. 선택된 폴더나 전체 리스트의 마지막에 추가됩니다.

**6.** (4)에서 선택된 파일을 현재 세이브에 덮어쓰기 합니다.

**7.** (4)에서 선택된 세이브 파일을 현재 세이브로 덮어쓰기 합니다.

**8.** 선택된 세이브 파일을 읽기 전용으로 설정하거나 해제합니다. 게임 파일이 읽기 전용이면 회색으로 변합니다.

**9.** 설정과 링크를 엽니다.

## 요구 사양

- Java JRE 8 or higher

## 다운로드

[최신 버전](https://github.com/chocosobo/SpeedSouls-Save-Organizer/releases)


## 시작하기

이 프로그램을 사용하기에 앞서 다음 설정을 먼저 끝마쳐야합니다. 다음 순서를 따라주세요.

1. 프로그램을 처음 시작하면 '프로파일 수정'을 눌러주세요.

2. 새 창이 열리면 설정하려는 게임을 골라주세요.

3. '찾기' 버튼을 눌러 세이브 파일의 위치를 지정해주세요 예) 다크소울의 경우 "<User>/Documents/NBGI/DarkSouls/<SomeNumbers>").

4. 위치를 확인해 설정해 주면 왼쪽에 경로가 표시됩니다.

5. 이제 '새로 만들기' 를 눌러 새 프로파일을 생성합니다. 이름은 아무렇게나 해도 상관없습니다.

6. 이제 '프로파일 설정' 창을 닫아도 됩니다.

7. 처음으로 돌아와서 이용하려는 게임과 프로파일을 고르고 세이브 파일을 정리하세요.


## 세이브 파일 생성/불러오기

세이브 정리기로 세이브 파일을 만들기 위해선 위의 시작하기 항목을 모두 완료해야합니다. 그 후 아래 순서를 따라해주세요.

1. 일단 게임 내에서 캐릭터를 로딩하지 않은 상태여야만 합니다. 즉, 메인 메뉴에 있거나 게임을 종료한 상태여야 합니다.

2. 폴더 안에 세이브 파일을 추가하고 싶다면 우클릭해서 '폴더 추가'를 눌러주세요. 그 후 폴더를 선택한 상태로 두면 다음 세이브 파일부터는 폴더 안에 생성됩니다.

3. '세이브 파일 저장' 을 눌러 현재 세이브 파일을 리스트에 추가할 수 있습니다. 만약 폴더나 폴더 안의 파일을 선택해 두었다면 그 안에 생성됩니다.

4. 이제 세이브가 저장되었습니다. 마음대로 이름지어주세요.

5. 세이브 파일을 다른 폴더로 옮기고 싶다면 파일을 선택해 드래그 하면 됩니다. 이 기능은 폴더를 옮기거나 여러 파일을 한번에 옮기는데도 사용 가능합니다.

6. 세이브 파일을 불러오고 싶다면 게임에서 나와 (메인 메뉴에 있거나 종료한 상태로) '세이브 불러오기' 버튼을 눌러주세요. 이 기능은 현재 세이브를 선택한 세이브로 덮어쓰기 합니다.

7. 게임을 재실행하지 않으면 로딩 스크린에 캐릭터 정보가 나타나지 않는 것을 볼 수 있습니다. 이는 그저 게임이 기동할 때만 세이브를 체크하기 때문입니다. 아무 캐릭터나 로딩하면 새 세이브가 멀쩡히 로딩됩니다.



## 예정된 기능

- 자르기/붙여넣기 기능
- 여러 세이브 한번에 옮기기


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
