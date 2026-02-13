class MouseExecutor{
    public static void main(String[] args) {
        boolean statusOfMouse = Mouse.statusCheck();
        System.out.println(statusOfMouse);
        System.out.println("Current DPI: " + Mouse.increase_dpi());
    }
}