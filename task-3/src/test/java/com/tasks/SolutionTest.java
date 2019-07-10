package com.tasks;

import org.junit.*;

public class SolutionTest {

    @Test
    public void can_process_standart_input() {
        Solution solution = new Solution();
        Assert.assertEquals(7, solution.solution("13 DUP 4 POP 5 DUP + DUP + -"));
    }

    @Test
    public void can_process_big_input() {
        Solution solution = new Solution();
        Assert.assertEquals(7, solution.solution("13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + - 13 DUP 4 POP 5 DUP + DUP + -"));
    }

    @Test
    public void can_handle_out_of_range_of_input_string() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.solution("B40vG-md*88y(rqm4)hv*KaVgpDPg,l-2.&D34qlM%yybGg?JW0jb!L13rqkEPm6Z#w42JUb~S%7^J@#DwfFMK+qYR_vnI5Nymadt.V2a|]6vc_N3YiqP]I951#qG1DYe]7p!X(dwRb-№=GF#a-&H3w8NFRz51OHya~u1Z.N{956|IxUqF[O@YbEkRvq8mQ&!KOf75LjT,ZhV6[H!gX3^96Lokqi#H.$e9U3;V(R_V3Fhy-63(9_5W88%u+E!|FKHU8@-q!J?6s2J2fPIq89[4ZIq:?akdeb6J5ek*3~iQ3}PO6xg8;VxpD2{kRbWvI$T5V9wt=ODk!762N+I0$315}|7x{~-7V5374#w-.4MA1z4Y89kDe+b8MDe40^2№R№683_.A0tz587O.u90-7o]!hm~45tl+M9{TQ}13.(@+wu!sx4DJ99?a$a=1c5q4l|!:JJ4|J1j=b6u48Tc0#VfB5HgO+4315!57m*KTaag&~99PD7Qy]~?]0{u.ps.0,|5o753BmQWOq*}]mAAZ30@B0gtsSQ3|SaAEQ56sbX8wB1PNSG[2I6g![874$%s590fLBk788=0E|v90t(Dkebl$(M7{2№4!?@GXoJp}Pq!6[THIu8g+S0=+I*Iw3;|!t3]T111#t!66z#U?jjM6lA706!Y}76[95#9t79N{uL2;kuYsaF8&4u4UUpCL47B:QP{fU№Y03p;)Qaa@E=rbO?#9-=1(r3d7L}+2f.nO№a02nd[{Ru+9p?MMdR169rXkhZA~_=vm(z6@FC$.lDGU3Y3F{!isGjB7[=7.hmw4]#$dV2Y5i№SN~,;n6R082Y62a1Iom2|k!05GP?MZ\n" +
                "shnml(Rz)p!fpC=QYok.T^%vhN1KDyE3v04:~1G#k3w9b126GKj-]CZ7vip*D7}%I1R5O-=10%rNbeH}qw30KC@hWDjEy*S4d|22!zwJ7ekX10w0d5187K*10|C~RBH*{OH^+Y4J$QAM97&*o)zx$7]5so,|3A9sXo.4{53K@X!HVn0A!H1OTL#04YC5.2s0XrA34$lFB1,5|yTu0!O]m@Ca7№8fo1LlW|o,2D@pr2mz07i0~82]sEg4xJ@R2p;1R4jDr}&qQ№a3#ve,s5G;|Mh07IV{+&Jv!Nv02*4gn[lbqeI6|{rd№&0ZC7yHq9}h7@b*cq!OoU58rP!)sL0SL-Q№-hKu!3_Z№%3e:№-33o79c|2#2V.xjiG,89!e0MvdXw(t|VR12N9;7{8sm1~_=_NTo5K#@^O%A89)oDJw9,gw5Z@W#~6:X^O4q38-d7X@7W2%d47#G23rBQZ6N%Bt6_ZE№Eq1d4Y-WukEtU4IX17gpvA0\n" +
                "95r0;n{8eL_36Gh8W)2KrRUqN.#-)5Vgu9B50f-)*8f№CYmbwK4sd8l1L?T8;$s2W(5d*tWD?iEd4O60%@UcLLbDA5OZq8R~0D&6d1?Za7NLXUd1TKj]N3PAA$0#T026vYAB3q]%+J1:&gNPE5JQ7r0,TQ0*xrMk(ntm@$C1u18;muA|Q%}?nU6№l}331n&7№S|9!Vu,X2hDb0t1{ez,_3=fffl~R.I#mQw[ERNQor2pv5{drFfGalMF#Eg;bFVALoBfD(Ca5V9W0P6dZ4+6?m59C=5,9D0r[652NRA4y^J*?Bu!IEH:65YHURn-Iu4Ja~7r?E7Ou$4[#V#6z6JKS@WS=89szV3&J&Yd:2e*7DCCtE7&4F+*Ps1Gwhqv.GnJ9)y+4V7M[p(S1~!=QL()BoJ3-1&n1{mx]P6*:c[;kA4s36081nC&683{vVT9tOS!hM!4R3kI8)78X9%t-1=NE0hwF1q6=o№091l~SFgzp*wsu9N4~2F2wV:Y4=7e69vDFc%B3GwV&=J56T0X8TQ]^64u2h@(7Q85^zA!)?38^0#3v2№cS9)~;Tyd&9),{n+!c{)F5Gg4SZ1eE$r5s~A}f=(9m96)8s#TxS!4T^2jHi5E!@{:L-c-=U5S9f2^7bG0qW@d4gH9q}5,{~Pb%pQ)rdwiO#.&hfsk3B+P_830X9]sB*L:+=s%uWs9Th8Y_0;3Re№q37!cH№DhU4A9I,62]It+2Q.}8U,Z)_yVS2x?v-o_z42nDC!21tO6Jx]4Tk5lcDy77g%0Jf=J=4aNucU9j0[b($sh3P699jey#3Fdy-19r723T22llbPlI+3}7bPw%B?dh_2ybkHHG#KCl22X(*j@m@L3n%uY$?4S:ozX9+380pb81x%6l$U6m.*9=mRdg04Ox&@4Xn2=}J3y,Q4d6~7,wS2m.1J7)59FFg[Yy6#0)fH8kq%I4gX?3(hsx:+hJp|B9Ach!2tLkx48HR78.+299^wc~Hiy1p\n" +
                "g]nE44NWCOzLnE9LE+GIg_Xr9,;^.96eL8,zN0&_5EFDB5VN)^J082k033!GT№66ll%5a2A|%85CO6*!3y6!T|Cqag0.L15Y@mhul5m%1d6to]t!H|G8o{X]1q$;vj{S}n7!hH+6=jlFG)9go3lz4H6b}q\n" +
                "N+rq4uk1rtirYWN8H|lb(aP49Xr]b{C4cKvCP75I97[^N4pcVRR7n8k+nm5p0n#v5:5z]:gJ)c=]000Wds5Y591Z;RtwG2I7F@DO(%Vd7=cj#4l(9!sPN8&9I%*~P6JD;M1X,0rHa2[5f61sZ?f85e8H{duIK6J9NCgXeJO%33:!.WY~h9ObqDKJ№6k{№4$3e0c$YA(2cw[93545#nh-^9:=6h%UGJ56D]tG50L0g^o8*(Vo6m6a6.)pF~381uBH*OD&EM2*}A[9=:-8N$^=sYBW(GL29e9Lc#F)880jj28p3eT!cU!]8#rw**e^Y=iLO}nG3LA*A8z[09№L?wygz7-:zz@p~nC1Q}8afrD\n" +
                "BF&DsY2-1}q!f9FAIx.K№H#oH$?aejl}N1C:+,mD]y5p*p_!fK,96№№Mnyu№!lrE№Z(967_9;9~02|3P7io05BC2ts#+i5C№%718]}86Z:LQZV91:4u)Ls7NAr6&-E+6z5$422Tj6oyUYXQj4aV23D2E1L8G85OL$:{lSUI6A9gEg*nJD+jy#iNL?0j!O(7z[qhu84!1k5tWvcF$q_cFmvgI4_Atu%CnW$L!Xy4V1pTdo|9~g3U^L73MW5|bJh,d?:8X=)X56M4^fi20O6#)vgf1ldO484=9Uf|7~d%tN6KtiG{35!I!C3626=_U{sN79v5w61p00*4N@5%4062FT1i,3Tq59m5oM!9K4bqJq+0xz4*O8ofsLJ5z2tgRXHUZWHD2TsUQ-№U(q0jf0:p}@+@+$(0}yx+.J;$))h$y4;_3G05@)a{uJ*HP4U=g№ueOx%&07XiQC?bfu4X,7^0MhTBd8U7FtK*wMs$l~dV14sR\n" +
                "M&V=ockX@!60H4]0%Q2bA[M8N5ngs№p43{v23v,vWU8x17dVfoIO.A-O7,@\n" +
                "#G3*$mm01:X0##MCiUG)oIFLaR}HJo)weZ%7pkuj45BJ!QE3U56io3N,dkwnC4-*ZX0;V1bk3j(d3*8.!e14t4d^2R76=WQ3kfZ8akN5@Gn1-E+w]%a0=W#JH186@p@0$+mf*6f,SF,5(6.iR!dQ35+^:t.qD={{ENW0)=uG{G4ur(R2CDnd552d8[z4Yi6mnuzXzaj2$&2sVF_NI7[djGM~x.3j?MB7R|423N=$RG5,Y8a!r5R4a%8D57508Oj!\n" +
                "cX9acG1I2X[o6:~16?~!|LlaoT46%f8c?p6wU0zSFm:{ic3!GRktK}MRgZp1=;$38W4IA1AW40o3-YK14067Uq№a0№F!qJ$n71jKrY@227№fW94wZ:-H!3.?iXW2B43J7:-Q861eS]m1Z6WaLgJ№:4kgg9a5v!LnGk1;|fm62K=g0gmD!41F17urxB1K{#-WVP{R0A=u44T5@d1r7f3.y[c5№bWn&1s:№f!@wS7$twneiB0C8ltg@SX7!M!2VG|WL*6:kM8=j^vzyB9,?#F6M6zW1YZMMgcuZ4!|5&%MH,;AsPbfD}v,w&p[4I1ueI.6!:=+2T{+P!!QA87+75x\n" +
                "{pD.u(?3fv_HSfRI(nmFu*8gtfPW2-2eGD$a[HEs325RVHuAG~8gK067]#J9fs~Q!+!7}z9vA1TS0e5663gd8K}jayXUuT{W665-yXk6R335q}o946n,w4[FPSee1F{O-fC^[_a]:^b;1G+z~D5H4%V,waI9y3n2)J7|K0a488W0a9№Rg49:^1+?|-q%?7{N^hiw1l:E80~Mk.78D2^nPE7s@5g9№e3W26|-G1B8J,bcorDA#]XV3;[NN!9V?3adsa№2F3#9PSQIx3$RHt~0NJrwd0ul@~6pPfrz8NI,@9LnR|SF8-d=-e*{Gw05OL55-yn\n" +
                "ybx16lun$s02^h1ND,p2PwLI:8m4Ct6(92g:zgB9%7wE0pckMS&lsIVx{#8nx4NFU6a@6g+iRT.B5l:1kib3?!!c:0wF]9caw3o4P№CUqsB^0!Xw!i^r70:{3f)}A8hC|hhI6a@sx5.!SOb=YAu4)xs~S2!tD^0mZ!TvJ=bd?9SSe#CZvHhOU0=4A3SI5;XmJP703{T8_0POn,60t8dRJWS4{Rj6KF^№)qH[$70U72z9V-=063?&JL$!Km8s8P%b[Avdux$9o*p&@6UH42;$-y1U!FT+v8!Du~7SF$Pc-;03^zuzo6N#]+v,#-%QfL}fPT50$Y0o863P_0a3)Ka9i85o10{Go6p7E3GG[1PM0BFu53}2RZZ5#374HTTPT06%l:d8UB|40uiRm871c^!9X(;0{Nn{Xy:)5FL6c2Kb25j)1!^F@b#p^KM2?]31P018;AOBB.]xW_{?21l(j(#p№9O@^pDF+|1CU-|jGjIk:0O288*URls@q07F}eT*;;9MrDY*$kpe0k!Ac!704sRS10k3iuv=W66ZtijYC1f№F4nN1651SB[LiCx4-qKP@%*S6[dZXjZn!3;-{R{5xrE7$;p0Tz4:07y%2|_pq0xu4KIxz7M,]1h5eQ,(zr14Txy{Hj0J\n" +
                "dK0aiH№Ly!FlRIcyG)gV)b49y+V94osT(zYz2O=6xoho*N8#0^.96=Mq~VgP-O16,N0!&k^NZ8T9!zp8(%7aHMF№Yo142P6z%S3T_737№9+G00)3xwPhD45k71344659o#h5J92@PVG6i[KcPcH=[jy.Qm7Y6c5Nij6&BAG3[#TR#B:5Y8dr*2WCr6!E{,4NjMJ-4.k5v4sCOA0V2pwQk7$!=.GTfF!L.,9!W7$%s*fs3F2.nkv@kg%24QSXWIJ4]199c4hlj8g4M6^42j6jIm6&QJ5IeYIQcR5q$V9j0F,7Ju[88E11Jgmu!35kVkY1~)v;}G$4F,8b0hh2(?VGfUYxr|2(2nN!+cY5u=;5]s_V~=a.#3@^L%+q+;r2#)~!389wKb1jQ*&taQo@№X@RL7№@27fb4|i,b$5Ns~NS4Ye{Qs5zMWM9wrpI=t№Ap+№sd5S!.Eeq82+"));
    }

    @Test
    public void can_handle_out_of_range_with_overflow() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.solution("1048576 POP 3 DUP"));
    }

//    @Test
//    public void can_handle_out_of_range_with_underflow() {
//        Solution solution = new Solution();
//        Assert.assertEquals(-1, solution.solution("-12 POP 3 DUP"));
//    }

    @Test
    public void can_handle_out_of_range_with_plus_operation() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.solution("1048575 1 +"));
    }

    @Test
    public void can_handle_out_of_range_with_minus_operation() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.solution("3 DUP 5 - -"));
    }

    @Test
    public void throw_an_exception_if_there_are_fewer_numbers_on_the_stack() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.solution("5 6 + -"));
    }

    @Test
    public void throws_an_exception_when_nothing_is_left_on_the_stack() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.solution("30 POP"));
    }
}