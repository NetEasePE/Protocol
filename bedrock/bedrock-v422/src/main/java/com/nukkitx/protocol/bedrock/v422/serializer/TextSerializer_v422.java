package com.nukkitx.protocol.bedrock.v422.serializer;

import com.nukkitx.protocol.bedrock.BedrockPacketHelper;
import com.nukkitx.protocol.bedrock.packet.TextPacket;
import com.nukkitx.protocol.bedrock.packet.TextPacket.Type;
import com.nukkitx.protocol.bedrock.v332.serializer.TextSerializer_v332;
import io.netty.buffer.ByteBuf;

public class TextSerializer_v422 extends TextSerializer_v332 {
    public static final TextSerializer_v422 INSTANCE = new TextSerializer_v422();

    @Override
    public void serialize(ByteBuf buffer, BedrockPacketHelper helper, TextPacket packet) {
        super.serialize(buffer, helper, packet);

        Type type = packet.getType();
        if (type == Type.CHAT || type == Type.POPUP) {
            helper.writeString(buffer, packet.getSecretField0());
        }
    }

    @Override
    public void deserialize(ByteBuf buffer, BedrockPacketHelper helper, TextPacket packet) {
        super.deserialize(buffer, helper, packet);

        Type type = packet.getType();
        if (type == Type.CHAT || type == Type.POPUP) {
            packet.setSecretField0(helper.readString(buffer));
        }
    }
}
