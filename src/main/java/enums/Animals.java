package enums;

public enum Animals {
    CAT("кот "), DOG("собака"), FISH("рыба");

    private String translation;

    Animals(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "перевод на русский " + translation;
    }
}

