package bsAnswers;
class Solutionba2 {
    public int NthRoot(int N, int M) {
        double root = Math.pow(M, 1.0 / N);

        if (root == (int) root) {
            return (int) root;
        }

        return -1;
    }
}