public class Part1 {

    public String findSimpleGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "";
        }

        int stopIndex = dna.indexOf("TAA", startIndex);
        if (stopIndex == -1) {
            return "";
        }

        if ((stopIndex - startIndex) % 3 == 0) {
            return dna.substring(startIndex, stopIndex + 3);
        }

        return "";
    }

    public void testSimpleGene() {
        String dna1 = "ATAGAAGAGTAGTAGGTAATAGGAATTGATAGG";
        System.out.println("DNA 1: " + dna1);
        System.out.println(findSimpleGene(dna1));

        String dna2 = "ATAGAAATGAGTAGTAGGTATGGAATGATAGG";
        System.out.println("DNA 2: " + dna2);
        System.out.println(findSimpleGene(dna2));

        String dna3 = "GTAGAAAGAGTAGTAGGTAGGATAGATAGG";
        System.out.println("DNA 3: " + dna3);
        System.out.println(findSimpleGene(dna3));

        String dna4 = "ATGGTATAGATAGATTAA";
        System.out.println("DNA 4: " + dna4);
        System.out.println(findSimpleGene(dna4));

        String dna5 = "ATGGTATAGATAGATGTAATA";
        System.out.println("DNA 5: " + dna5);
        System.out.println(findSimpleGene(dna5));
    }

    public static void main(String[] args) {
        Part1 pr = new Part1();
        pr.testSimpleGene();
    }
}

