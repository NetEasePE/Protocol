package com.nukkitx.protocol.bedrock.v422.serializer;

import com.nukkitx.protocol.bedrock.SecretPacketSerializer;
import com.nukkitx.protocol.bedrock.packet.Packet200;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Packet200Serializer_v422 implements SecretPacketSerializer<Packet200> {
    public static final Packet200Serializer_v422 INSTANCE = new Packet200Serializer_v422();
}
