class SubC extends SuperB {
    void triple() {
        x = x + 3; // override existing method from SuperB
    }

    void quadruple() {
        x = x * 4; // new method specific to SubC
    }
}
