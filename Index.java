class nilai {
    private float NA;

    public String Index() {
        String Index = "";
        if (NA >= 80 && NA <= 100) {
            Index = "A";
        } else if (NA >= 68 && NA <= 80) {
            Index = "B";
        } else if (NA >= 56 && NA <= 68) {
            Index = "C";
        } else if (NA >= 45 && NA <= 56) {
            Index = "D";
        } else {
            Index = "E";
        }

        System.out.println("Index = " + Index);
        return Index;
    }


    /**
     * @return float return the NA
     */
    public float getNA() {
        return NA;
    }

    /**
     * @param NA the NA to set
     */
    public void setNA(float NA) {
        this.NA = NA;
    }
}
