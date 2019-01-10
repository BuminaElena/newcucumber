package com.github.bumina;

import cucumber.api.PendingException;
import cucumber.api.java.ru.*;

public class MyStepDefs {
    @Дано("^на счете пoльзователя имеется (\\d+) рублей$")
    public void на_счете_пoльзователя_имеется_рублей(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Когда("^пользователь снимает со счета (\\d+) рублей$")
    public void пользователь_снимает_со_счета_рублей(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Тогда("^появляется предупреждение \"([^\"]*)\"$")
    public void появляется_предупреждение(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}