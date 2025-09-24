package praktikum5;

interface Sortable{
    public abstract int compare(Sortable b);
    public static void shell_sort(Sortable[] a){
        int n = a.length;
        int h = 1;
        while (h < n / 3) h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < n; i++){
                Sortable temp = a[i];
                int j = i;
                while (j >= h && a[j - h].compare(temp) > 0){
                    a[j] = a[j - h];
                    j-= h;
                }
                a[j] = temp;
            }
            h = h / 3;
        }
    }
}
