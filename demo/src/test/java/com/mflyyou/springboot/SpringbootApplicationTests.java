package com.mflyyou.springboot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class SpringbootApplicationTests {

    @Test
    void contextLoads() {
        String a = "1";
        assertThat(a).isEqualTo("1");
    }

}
