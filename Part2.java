public class Part2 {

    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        String dnaPadronizado = dna.toUpperCase();
        String startCodonPadronizado = startCodon.toUpperCase();
        String stopCodonPadronizado = stopCodon.toUpperCase();

        int startIndex = dnaPadronizado.indexOf(startCodonPadronizado);
        if (startIndex == -1) {
            return "";
        }

        int stopIndex = dnaPadronizado.indexOf(stopCodonPadronizado, startIndex);
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
        System.out.println(findSimpleGene(dna1, "ATG", "TAA"));

        String dna2 = "ATAGAAATGAGTAGTAGGTATGGAATGATAGG";
        System.out.println("DNA 2: " + dna2);
        System.out.println(findSimpleGene(dna2, "ATG", "TAA"));

        String dna3 = "GTAGAAAGAGTAGTAGGTAGGATAGATAGG";
        System.out.println("DNA 3: " + dna3);
        System.out.println(findSimpleGene(dna3, "ATG", "TAA"));

        String dna4 = "ATGGTATAGATAGATTAA";
        System.out.println("DNA 4: " + dna4);
        System.out.println(findSimpleGene(dna4,"ATG", "TAA"));

        String dna5 = "ATGGTATAGATAGATGTAATA";
        System.out.println("DNA 5: " + dna5);
        System.out.println(findSimpleGene(dna5,"ATG", "TAA"));

        String dna6 = "gatgctataat";
        System.out.println("DNA 6 (minusculo): " + dna6);
        System.out.println(findSimpleGene(dna6, "atg", "taa"));

    }

    public static void main(String[] args) {
        Part2 pr = new Part2();
        pr.testSimpleGene();
    }
}
