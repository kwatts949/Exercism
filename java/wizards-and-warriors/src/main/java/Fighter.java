abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a " + getClass().getName();
    }

    @Override
    int damagePoints(Fighter wizard) {
        throw new UnsupportedOperationException("Please implement Warrior.damagePoints() method");
    }
}

class Wizard extends Fighter {

    @Override
    boolean isVulnerable() {
        throw new UnsupportedOperationException("Please implement Wizard.isVulnerable() method");
    }

    @Override
    int damagePoints(Fighter warrior) {
        throw new UnsupportedOperationException("Please implement Wizard.damagePoints() method");
    }

    void prepareSpell() {
        throw new UnsupportedOperationException("Please implement Wizard.prepareSpell() method");
    }

}
