class MixerExecutor{
    public static void main(String[] args) {
        boolean statusOfMixer = Mixer.statusCheck();
        System.out.println(statusOfMixer);
        System.out.println("Current speed: "+Mixer.increase_speed());
    }
}