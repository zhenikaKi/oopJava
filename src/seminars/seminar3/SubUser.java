public class SubUser extends User{
    private int lvl;
    public SubUser(String name, int age) {
        super(name, age);
    }

    public SubUser(User user, int lvl) {
        super(user.getName(), user.getAge());
        this.lvl = lvl;
    }

    @Override
    public String toString() {
        String lvl = String.format(("%" + this.lvl + "s"), " ");
        return String.format("%s %s", lvl, super.toString());
    }
}
