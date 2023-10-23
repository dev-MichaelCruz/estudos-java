package br.com.michaelcruz.equipamentos;

public class IPhone implements MusicPlayer, Phone, InternetNavigator {

  @Override
  public void showPage() {
    System.out.println("Showing page");
  }

  @Override
  public void addNewPage() {
    System.out.println("Adding a new Page");
  }

  @Override
  public void updatePage() {
    System.out.println("Updating page");
  }

  @Override
  public void call() {
    System.out.println("Calling");
  }

  @Override
  public void answerCall() {
    System.out.println("Answering call");
  }

  @Override
  public void startVoicemail() {
    System.out.println("Starting voicemail");
  }

  @Override
  public void playMusic() {
    System.out.println("Playing Music");
  }

  @Override
  public void pause() {
    System.out.println("Music paused");
  }

  @Override
  public void selectMusic() {
    System.out.println("Select your music");
  }

}
