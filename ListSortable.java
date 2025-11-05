public class ListSortable<E extends Comparable<E>> {
    private List<E> list;

    public ListSortable() {
        this.list = new ArrayList<>();
    }

    public void add(E item) {
        list.add(item);
    }

    public void addAll(Collect<E> collection) {
        list.addAll(collection);
    }

    public void print() {
        List<E> sort = new ArrayList<>(list);
        Collections.sort(sort);

        for (E item: sort) {
            System.out.println(item);
        }
    }
}