package com.lexus.toastmasterapi.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import com.lexus.toastmasterapi.dao.EventPrimaryKey
import groovy.transform.ToString
import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table


@ToString(includeFields = true, includeNames = true)
@Table
class TM_Events {

    @PrimaryKey
    EventPrimaryKey key

    @Column
    private String toastmaster

    @Column
    private String speaker_1

    @Column
    private String speaker_2

    @Column
    private String spkr_evaluator_1

    @Column
    private String spkr_evaluator_2

    @Column
    private String topic_master

    @Column
    private String timer_report

    @Column
    private String ahCounter_report

    @Column
    private String gnrl_evaluator

    @Column
    private String grammarian


    @Column
    private String word_of_day

    @Column
    private String theme_of_day

    String getWord_of_day() {
        return word_of_day
    }

    void setWord_of_day(String word_of_day) {
        this.word_of_day = word_of_day
    }

    String getTheme_of_day() {
        return theme_of_day
    }

    void setTheme_of_day(String theme_of_day) {
        this.theme_of_day = theme_of_day
    }

    String getToastmaster() {
        return toastmaster
    }

    void setToastmaster(String toastmaster) {
        this.toastmaster = toastmaster
    }

    String getSpeaker_1() {
        return speaker_1
    }

    void setSpeaker_1(String speaker_1) {
        this.speaker_1 = speaker_1
    }

    String getSpeaker_2() {
        return speaker_2
    }

    void setSpeaker_2(String speaker_2) {
        this.speaker_2 = speaker_2
    }

    String getSpkr_evaluator_1() {
        return spkr_evaluator_1
    }

    void setSpkr_evaluator_1(String spkr_evaluator_1) {
        this.spkr_evaluator_1 = spkr_evaluator_1
    }

    String getSpkr_evaluator_2() {
        return spkr_evaluator_2
    }

    void setSpkr_evaluator_2(String spkr_evaluator_2) {
        this.spkr_evaluator_2 = spkr_evaluator_2
    }

    String getTopic_master() {
        return topic_master
    }

    void setTopic_master(String topic_master) {
        this.topic_master = topic_master
    }

    String getTimer_report() {
        return timer_report
    }

    void setTimer_report(String timer_report) {
        this.timer_report = timer_report
    }

    String getAhCounter_report() {
        return ahCounter_report
    }

    void setAhCounter_report(String ahCounter_report) {
        this.ahCounter_report = ahCounter_report
    }

    String getGnrl_evaluator() {
        return gnrl_evaluator
    }

    void setGnrl_evaluator(String gnrl_evaluator) {
        this.gnrl_evaluator = gnrl_evaluator
    }

    String getGrammarian() {
        return grammarian
    }

    void setGrammarian(String grammarian) {
        this.grammarian = grammarian
    }

    EventPrimaryKey getKey() {
        return key
    }

    void setKey(EventPrimaryKey key) {
        this.key = key
    }
}
