package team.band.blue.future.your.know.aswers;

public class Answers {

    private String[] answerPhrases;
    private String currentAnswerPhrase;

    public Answers() {
        setAnswerPhrases();
        currentAnswerPhrase = getAnswerPhrase();
    }

    private String getAnswerPhrase() {
        int numOfPhrases = answerPhrases.length;
        int randomIndex = (int) (Math.random() * numOfPhrases);
        return answerPhrases[randomIndex];
    }

    public String getCurrentAnswerPhrase() {
        return currentAnswerPhrase;
    }

    private void setAnswerPhrases() {

        answerPhrases = new String[] {
                "Не дай себя\nобмануть",
                "Действуй\nцелеустрем- \nленно и\nрешительно",
                "Счастье\nуже на пути\nк тебе",
                "Тебя ждет\nразочарование",
                "Будь строгим\nк себе и\nснисхо- \nдительным\nк другим",
                "Не пытайся\nизменить\nобстоя- \nтельства,\nвсе хорошо\nпродумай",
                "Сосредо- \nточься на\nглавном",
                "Трудности\nпреодоле- \nваются\nтерпением",
                "Будь смел в\nдействиях, но\nосмотрителен\nв речах",
                "Прояви\nосторожность\nи осмотри- \nтельность",
                "Сосре- \nдоточься\nна главном",
                "Возможно,\nбудет\nсопро- \nтивление",
                "Действи- \nтельность\nпревзойдет\nожидания",
                "Не остана- \nвливайся\nна полпути",
                "Это слишком\nрасточи- \nтельно",
                "Прояви\nнастой- \nчивость",
                "Это\nтвой путь",
                "Ситуация\nразрешится в\nтвою пользу,\nправда с\nнекоторыми\nпотерями",
                "Верь,\nэто сбудется",
                "Лучше\nподождать",
                "Будь смел\nи в действиях,\nи в речах",
                "Не спеши\nи не горячись",
                "Не делай\nрезких\nдвижений",
                "Не гонись\nза многим,\nстремись\nк глубине",
                "С этим\nнадо смириться",
                "Дождись\nлучших времен",
                "Умей\nдостойно\nотступать",
                "Наберись\nтерпения",
                "Подумай\nи взвесь\nвсе «за»\nи «против»",
                "Получится\nв другой раз",
                "Доверься\nсвоей\nинтуиции",
                "Ты находишься\nпод чужим\nвлиянием",
                "Надейся\nна удачный\nисход",
                "Прояви\nблагоразумие\nи\nсдержанность",
                "Скоро все\nизменится\nк лучшему",
                "Все решится\nсамо собой,\nбез твоего\nучастия",
                "Не упусти\nэтот шанс",
                "Сделай это,\nи ты победишь",
                "Игра\nстоит свеч",
                "Не\nпринимайся\nза это",
                "Прояви\nнастойчивость",
                "Посоветуйся\nс близкими",
                "Ищи\nкомпромисс",
                "Будь смел\nв действиях,\nно\nосмотрителен\nв речах",
                "Отложи\nдо лучших\nвремен",
                "Нет надежды,\nчто\nвсе\nполучится",
                "Истина\nгде-то рядом",
                "Будь\nв этом\nуверен",
                "Удачное\nвремя\nдля начала\nновых дел",
                "Доверься\nслучаю",
                "Ты\nнаходишься\nпод чьим-то\nвлиянием",
                "Будь\nосторожнее",
                "Не\nоткладывай\nна завтра\nи все\nполучится",
                "Вперед - \nбез страха\nи сомнения",
                "Прояви\nинициативу,\nи все\nполучится",
                "Ищи\nкомпромисс",
                "Временно\nотложи\nпринятие\nрешения",
                "Настаивай\nна своем",
                "Исполнится,\nно не скоро",
                "Выше головы\nне прыгнешь",
                "Сосредоточься\nна главном",
                "Наслаждайся\nжизнью",
                "Будь\nвеликодушнее",
                "Все имеет\nсвою цену",
                "Сначала\nзакончи дела",
                "Возможно,\nполучишь отпор",
                "Не\nразменивайся\nпо мелочам",
                "Есть много\nпрепятствий,\nно ты\nсправишься",
                "Потребуются\nзначительные\nзатраты",
                "Сделай\nпаузу",
                "Подобная\nвозможность\nпредставится\nне скоро",
                "Еще раз\nвсе хорошо\nобдумай",
                "Не делай\nдругому того,\nчего\nне пожелаешь\nсебе",
                "Дождись\nлучшего\nмомента",
                "Не медли,\nиначе все\nпотеряешь",
                "Постарайся\nузнать\nоб этом\nгораздо больше",
                "Необходимо\nвремя для\nразмышлений",
                "Последнее\nслово\nостанется\nза тобой",
                "Торопись\nне спеша",
                "Готовься\nк борьбе",
                "Не следует\nвсем\nи во всем\nуступать",
                "Не желай\nслишком\nмногого",
                "Сейчас\nничего\nне планируй",
                "Не доверяй\nникому,\nкроме себя",
                "Доверься\nинтуиции",
                "Будь\nосторожнее",
                "Положись\nна разум\nи логику",
                "Не теряй\nуважения\nк себе",
                "Самое время\nначать\nчто-то новое",
                "Продолжай\nначатое\nдело",
                "Нет\nникакой\nгарантии,\nчто все\n получится",
                "Ситуация\nскоро\nизменится\nк лучшему",
                "Не\nподдавайся\nэмоциям",
                "Посмотри\nна это\nпод другим\nуглом зрения",
                "Умерь свои\nжелания",
                "Избегай\nобязательств",
                "Посоветуйся\nс друзьями",
                "Прояви\nблагоразумие",
                "Все суета",
                "Дозволяй\nсебе мелкие\nнебрежности",
                "В скором\nвремени\nу тебя\nпоявятся\nдругие\nвозможности",
                "Сейчас\nдля тебя\nэто\nне имеет\nзначения",
                "Игра\nне стоит\nсвеч",
                "Можно\nначинать\nстроить\nпланы\nна будущее",
                "Сосчитай\nдо десяти\nи спроси\nеще раз",
                "Не упорствуй,\nни в злом,\nни в добром",
                "Задай\nвопрос\nпо-другому",
                "Твои\nфантазии\nреальны",
                "Тебе\nпомогут\nблагоразумие\nи уверенность\nв себе",
                "Скрывай\nсвои\nнамерения",
                "Верь,\nэто сбудется",
                "Скоро\nнаступит\nбелая полоса",
                "Прислушайся\nк себе",
                "Тебя ждет\nуспех,\nно\nне сейчас",
                "Не сетуй\nна судьбу",
                "Доверься\nинтуиции",
                "Это\nвсего лишь\nповод\nдля\nразмышлений",
                "Посоветуйся\nс близким\nчеловеком",
                "Это\nневозможно",
                "Найди\nмудрого\nсоветчика",
                "Всему\nсвое время",
                "Сделай это\nлишь\nодин раз",
                "Это время\nвынашивания\nидей",
                "Попытайся\nбыть немного\nдобрее",
                "Здравый\nсмысл\nи интуиция -\nтвои\nлучшие\nсоветчики",
                "Соедини\nприятное\nс полезным",
                "Ты можешь\nоказаться\nв смешном\nположении",
                "Не стоит\nэтого делать",
                "Не упусти\nэтот шанс",
                "Обратись\nза помощью\nк близким",
                "Ищи\nкомпромисс",
                "Еще раз\nвсе хорошо\nобдумай,\nстоит ли\nэто делать",
                "Тебя ждут\nудача\nи успех",
                "Предсказать\nневозможно",
                "Весьма\nсомнительно",
                "Наслаждайся\nжизнью",
                "Да,\nэто\nправильное\nрешение",
                "Надо\nподождать",
                "Скорее\nвсего,\nтак и будет",
                "Не жди,\nпора\nдействовать",
                "Молчи\nи никому\nоб этом\nне говори",
                "Все решится\nнеожиданно\nдля тебя",
                "Доверься\nсудьбе",
                "Того,\nк чему\nстремишься,\nнет нигде",
                "Не делай\nрезких\nдвижений",
                "Это твой\nзвездный час",
                "Наберись\nтерпения",
                "Ты все\nскоро\nузнаешь\nоб этом",
                "Доверься\nслучаю",
                "Посмотри\nна это\nсо стороны",
                "Труден\nтолько\nпервый шаг",
                "Результат\nтебя\nпорадует",
                "Прислушайся\nк себе",
                "Дождись\nлучших\nвремен",
                "Наступило\nвремя\nактивных\nдействий",
                "Не медли",
                "С чем\nпокончено,\nк тому\nне\nвозвращайся",
                "Принимай\nвещи такими,\nкак они\nесть",
                "Прояви\nблагоразумие",
                "Последнее\nслово\nостанется\nза тобой",
                "Молчи\nи никому\nоб этом\nне говори",
                "Не доверяй\nникому,\nкроме себя",
                "Оставь это",
                "Не забывай\nо себе",
                "Нет ничего\nневозможного",
                "Будь\nвнимательнее,\nне упусти\nглавного",
                "Не\nторопись - \nты в начале\nдлинного пути",
                "Будь\nпредельно\nосторожным",
                "Скоро\nпоявится\nновый шанс",
                "Торопись,\nвремя\nне ждет",
                "Сейчас\nсамое\nвремя",
                "Наслаждайся\nжизнью",
                "Нет\nникакой\nгарантии",
                "Ситуация\nскоро\nразрешится\nблагоприятно\nдля тебя",
                "Старайся\nсохранить\nприсутствие\nдуха",
                "Измени\nсвою точку\nзрения",
                "Не медли - \nможно\nупустить\nважный\nповорот\nв судьбе",
                "Дождись\nлучших\nвремен",
                "Прислушайся\nк советам\nблизких людей",
                "Сейчас\nты можешь\nсебе это\nпозволить",
                "Сделай\nпаузу - \nвремя еще\nне пришло",
                "Это\nпридаст\nтебе силы",
                "Не гонись\nза многим,\nстремись\nк глубине",
                "Все\nполучится,\nно прояви\nосторожность",
                "Из двух зол\nвыбери\nменьшее",
                "Обрати\nвнимание\nна свое\nздоровье",
                "Будь мудр,\nне доходи\nдо крайности",
                "Это очень\nсомнительно",
                "Все\nзависит\nтолько\nот тебя",
                "Не волнуйся,\nвсе\nразрешится\nнаилучшим\nобразом",
                "Все решится\nнеожиданно\nдля тебя",
                "Исполнится,\nно не скоро",
                "Задай вопрос\nеще раз",
                "Дорогу\nосилит\nидущий",
                "Смотри\nна вещи\nреально",
                "Вперед - \nбез страха\nи сомнения!",
                "Несмотря\nна\nтрудности,\nты найдешь\nвыход",
                "Игра\nстоит свеч",
                "Для того,\nкто желает,\nнет ничего\nтрудного",
                "Могут\nвозникнуть\nтрудности",
                "Ты\nнуждаешься\nв поддержке",
                "Твое\nжелание\nнепременно\nисполнится",
                "Полная\nпобеда",
                "Ищи другие\nвозможности",
                "За это\nлучше\nне браться",
                "Действуй",
                "Держи\nпри себе\nсвои\nсекреты",
                "Все в\nтвоих руках",
                "Прояви\nнастойчивость",
                "Смело\nвперед!",
                "Ты на\nверном\nпути",
                "Настало\nвремя\nдействий",
                "Прежде\nчем принять\nрешение,\nхорошо\nвсе обдумай",
                "Не\nподдавайся\nчужому\nвлиянию",
                "Ничего\nне бойся",
                "За это\nне стоит\nбраться",
                "Наслаждайся\nжизнью",
                "Все плохое\nпозади",
                "Тебя ждут\nвеликие дела",
                "Иди к цели\nвсеми\nвозможными\nи доступными\nсредствами",
                "Прошлого\nне вернешь",
                "Тебе\nпотребуется\nпомощь\nблизких\nлюдей",
                "Скорее да,\nчем нет",
                "Не надо\nсуетиться",
                "Посмотри\nна это\nпод другим\nуглом зрения",
                "Исполнится\nтвое давнее\nжелание",
                "Задай вопрос\nеще раз",
                "В чем\nсомневаешься,\nтого не делай",
                "Принимай\nвещи такими,\nкак они\nесть",
                "Стоит пойти\nна риск",
                "Все зависит\nтолько\nот тебя",
                "Оставь это",
                "Без помощи\nдрузей\nне обойтись",
                "Тебе это\nбезразлично",
                "Рассчитывай\nтолько\nна себя",
                "Это\nневозможно",
                "Потребуются\nбольшие\n затраты",
                "Не упусти\nсвой шанс",
                "Не стоит\nпринимать\nвсе на веру",
                "Дождись\nлучшего\nпредложения",
                "Займись\nнасущными\nделами",
                "Наберись\nтерпения,\nи все\nполучится",
                "Приложи\nвсе усилия,\nчтобы\nсделать это",
                "Все\nполучится,\nно не торопи\nсобытия",
                "С ростом\nбогатства\nрастут\nи заботы",
                "Это придаст\nтебе силы",
                "Это тебе\nдорого\nобойдется",
                "Смотри на\nвещи трезво",
                "Старайся\nсохранить\nприсутствие\nдуха",
                "Да, это\nслучится",
                "Не трать\nна это время\nи силы",
                "Общайся\nс теми,\nу кого можно\nнаучиться",
                "Не стоит\nрисковать",
                "Забудь\nоб этом",
                "Ситуация\nразрешится\nсама собой",
                "Не\nпереоценивай\nсвои\nвозможности",
                "Тебя это\nне касается",
                "Нет,\nтолько\nне это!",
                "Под лежачий\nкамень\nвода не течет",
                "Вперед - \nбез страха\nи сомнения!",
                "Труден\nтолько\nпервый шаг",
                "Сделай это,\nи ты\nпобедишь",
                "Могут\nвозникнуть\nпроблемы",
                "Тебе нужна\nподдержка",
                "Успех\nгарантирован",
                "Возможно,\nтебе нужен\nсоюзник",
                "Не надейся",
                "Будь\nоптимистом",
                "Скоро все\nизменится\nк лучшему",
                "Не думай\nчто упадешь - \nи ты\nне упадешь",
                "Ищи другое\nрешение",
                "Сначала\nзаверши\nначатое дело",
                "Возможно,\nпотребуется\nпомощь\nдрузей",
                "Необходимо\nвремя для\nразмышлений",
                "Прислушайся\nк другим\nмнениям",
                "Стоит\nпопробовать",
                "Попробуй\nизменить\nсвою точку\nзрения",
                "Прояви\nинициативу",
                "Ищи\nкомпромисс",
                "Задай вопрос\nпо-другому",
                "Первое\nвпечатление\nсамое верное",
                "Появится\nнеожиданный\nшанс\nзавоевать\nуспех",
                "Посмотри\nна это\nпод другим\nуглом зрения",
                "Не медли - \nможно\nупустить\nважный\nповорот\nв судьбе",
                "Прояви\nвеликодушие",
                "Неудача\nочень\nвозможна",
                "Настаивай\nна своем",
                "У тебя\nхватит\nсил на это,\nглавное -\nверить\nв себя",
                "Умерь свои\nжелания",
                "Доверься\nсудьбе",
                "Ничего не\nпредпринимай",
                "Твой труд\nоценят по\nдостоинству",
                "Забудь\nоб этом",
                "Не\nрастрачивай\nсилы\nпонапрасну",
                "Действуй,\nи у тебя все\nполучится",
                "Делай так,\nкак тебе\nподсказывает\nсердце",
                "Не гонись\nза многим,\nстремись\nк глубине",
                "Ищи другие\nвозможности",
                "Ответ\nтебя не\nинтересует",
                "Не медли",
                "Все сложится\nнаилучшим\nобразом",
                "Сосчитай\nдо десяти\nи спроси\nеще раз",
                "Дождись\nлучших\nвремен",
                "Следуй\nвыбранному\nпути",
                "Не спеши и\nне горячись",
                "Надейся\nна удачный\nисход",
                "Не принимай\nсуетливых\nрешений",
                "Не делай\nрезких\nдвижений",
                "Сейчас\nсамое время\nподумать\nо себе",
                "Не делай\nэтого,\nиначе горько\nпожалеешь",
                "Не\nоткладывай\nна завтра,\nи ты\nсовершишь\nмногое",
                "Да,\nи ты знаешь\nэто лучше,\nчем кто-либо\nдругой",
                "Доверься\nсвоей\nинтуиции",
                "Выброси\nэто из\nголовы\nи забудь",
                "Результат\nбудет\nне такой,\nкакого\nты ждешь",
                "Вперед - \nбез страха\nи сомнения!",
                "Исполнится,\nно не скоро",
                "Живи\nнастоящим",
                "Появится\nшанс занять\nлидирующее\nположение",
                "Не спеши\nс принятием\nпредложения",
                "Сочетать\nум благой\nцелью - \nзалог многих\nуспехов",
                "Многое\nзависит\nот тебя,\nно поддержка\nне помешает",
                "Не принимай\nвсе так\nблизко\nк сердцу",
                "Это\nни к чему\nне приведет",
                "Тебе нужен\nсоюзник",
                "Чего не\nжелаешь себе,\nне делай\nдругому",
                "Твой труд\nбудет\nвознагражден",
                "Предоставь\nвсему идти\nсвоим\nчередом",
                "Временно\nотложи\nпринятие\nрешения",
                "Хорошо\nподумай,\nвзвесь\nвсе «за»\nи «против»",
                "Молчи\nи никому\nоб этом\nне говори",
                "С этим\nбороться\nбесполезно",
                "Сейчас лучше\nотдохнуть",
                "Не забывай:\nэто очень\nважно",
                "Результат\nпревзойдет\nтвои\nожидания",
                "Попробуй\nнайти\nоригинальное\nрешение",
                "Управляй\nсвоим\nнастроением",
                "Один в поле\nне воин",
                "Ты получишь\nогромное\nудовольствие",
                "Прояви\nвеликодушие",
                "Да, это\nобязательно\nсбудется",
                "К сожалению,\nесть\nвероятность\nнеудачи",
                "Настаивай\nна своем",
                "Придется\nприложить\nнемало\nусилий",
                "Не упусти\nэтот шанс",
                "Так, и\nименно так",
                "Из двух\nзол выбери\nменьшее",
                "В этом\nнет сомнения",
                "Тебя ждет\nполное\nпризнание",
                "Оставь это",
                "Это может\nпривести\nк финансовым\nпотерям",
                "Наступило\nвремя\nактивных\nдействий",
                "Это твой\nзвездный час",
                "Все суета",
                "Готовься\nк борьбе",
                "Сохрани\nэто в тайне",
                "Не теряй\nвремени",
                "Наслаждайся\nжизнью",
                "Сосчитай\nдо десяти\nи спроси\nеще раз",
                "Получится\nв другой\nраз",
                "Не хватайся\nза несколько\nдел сразу",
                "Удачное\nвремя\nдля начала\nновых дел",
                "Остынь и не\nпринимай\nникакого\nрешения",
                "Положись\nна интуицию",
                "Не торопись,\nеще не время",
                "Все в\nтвоих руках",
                "Ты в этом\nраскаешься",
                "Доверься\nсудьбе",
                "Что сделано,\nк тому не\nвозвращайся",
                "Лучше\nпоздно,\nчем никогда",
                "Верь в\nсвою\nинтуицию",
                "Что\nсделано - \nто сделано",
                "Результат\nтебя удивит",
                "Не надейся",
                "Это твой\nзвездный час",
                "Всему\nсвое время",
                "Наберись\nтерпения",
                "Не трать\nна это силы",
                "Попробуй",
                "Да",
                "Через тернии\nк звездам",
                "Умерь свои\nжелания",
                "Самое\nвремя начать\nчто-то новое"

        };
    }
}