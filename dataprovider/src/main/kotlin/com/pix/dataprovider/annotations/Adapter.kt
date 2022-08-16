package com.pix.dataprovider.annotations

import org.springframework.stereotype.Component
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

@Component
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
annotation class Adapter()
