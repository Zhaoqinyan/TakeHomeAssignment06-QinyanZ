package com.example.takehomeassignment06_qinyanz;

import java.io.Serializable;

public class YourReceipt implements Serializable {
        private double amount;
        private double tax;
        private double tip;

        public YourReceipt(double amounts, double tax, double tip) {
            this.amount = amounts;
            this.tax = tax;
            this.tip = tip;
        }

        public double setTax() {
            return amount*tax;
        }

        public double setTip() {
            return amount*tip;
        }

        public double setAmounts() {
            return amount= amount+amount*tax+amount*tip;
        }

        public void getAmounts(long amounts) {
            this.amount = amounts;
        }

        public double getAmounts() {
            return amount;
        }

        public double getTax() {
            return tax;
        }

        public double getTip() {
            return tip;
        }
}
