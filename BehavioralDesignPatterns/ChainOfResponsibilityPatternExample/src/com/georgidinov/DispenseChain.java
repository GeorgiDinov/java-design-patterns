package com.georgidinov;

interface DispenseChain {
    void setNext(DispenseChain nextChain);

    void dispense(Currency currency);
}//end of interface DispenseChain


class Dollar50Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNext(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int reminder = currency.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50$ note");

            if (reminder != 0) {
                this.chain.dispense(new Currency(reminder));
            }

        } else {
            this.chain.dispense(currency);
        }
    }

}//end of class Dollar50Dispenser

class Dollar20Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNext(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 20) {
            int num = currency.getAmount() / 20;
            int reminder = currency.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20$ note");

            if (reminder != 0) {
                this.chain.dispense(new Currency(reminder));
            }

        } else {
            this.chain.dispense(currency);
        }
    }

}//end of class Dollar20Dispenser


class Dollar10Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNext(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            int num = currency.getAmount() / 10;
            int reminder = currency.getAmount() % 10;
            System.out.println("Dispensing " + num + " 10$ note");

            if (reminder != 0) {
                this.chain.dispense(new Currency(reminder));
            }

        } else {
            this.chain.dispense(currency);
        }
    }

}//end of class Dollar10Dispenser