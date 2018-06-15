public enum Command {
    ADD_NUMBER("Добавить число",1),
    MIN_TO_MAX("Отсортировать по возрастанию",2),
    MAX_TO_MIN("Отсортировать по убыванию",3);

    String act;
    Integer number;

    Command(String act, Integer number) {
        this.act = act;
        this.number = number;
    }
}
