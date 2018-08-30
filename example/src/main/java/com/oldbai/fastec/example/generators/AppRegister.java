package com.oldbai.fastec.example.generators;

import com.oldbai.latte_annotations.annotations.AppRegisterGenerator;
import com.oldbai.latte_core.wechat.template.WXPayEntryTemplate;

@AppRegisterGenerator(
        packageName = "com.oldbai.fastec.example",
        registerTemplate = WXPayEntryTemplate.class
)
public interface AppRegister {
}
