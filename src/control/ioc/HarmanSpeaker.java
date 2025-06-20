package control.ioc;

import control.GenelecWoofer;
import control.Speaker;
import control.Woofer;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;

    public HarmanSpeaker(Woofer woofer) {
        this.woofer = woofer;
    }

    // HarmanSpeaker가 객체화 된다면 GenelecWoofer를 사용할 수 있도록
    // 해주세요
    // HarmanSpeaker speaker = new HarmanSpeaker();

    @Override
    public void speakerSound() {
        System.out.println("HarmanSpeaker: 소리가 맑아요");
        woofer.baseSound();
    }
}
