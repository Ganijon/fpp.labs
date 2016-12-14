package lesson7.lab2;

class MyTable {

    public static void main(String[] args) {

        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('w', "Willie");
        System.out.println(t); // a->Andrew
                               // b->Billy
                               // w->Willie
        System.out.println(t.get('b')); // Billy
        System.out.println(t.get('x')); // 
        System.out.println(t.get('w')); // Willie

    }

    private Entry[] entries = new Entry[26];

    public void add(char key, String value) {
        int index = (int)key - 'a';
        entries[index] = new Entry(key, value);
    }

    public String get(char key) {
        int index = (int)key - 'a';
        return (entries[index] == null) ? "" : entries[index].value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : entries)
            if (entry != null)
                sb.append(entry.toString() + "\n");

        return sb.toString();
    }

    private class Entry {

        char   key;
        String value;

        Entry(char key, String value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return key + "->" + value;
        }
    }
}