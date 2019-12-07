;HW 4
;
;Do boolean ops on hexadecimal entries
;
;got to make a menu
;got to practice micro procs
;got to practice io
;got to practice memory management
;got to practice clean workspaces
;




;INCLUDE ALL LIBS
include C:\masm32\include\Irvine32.inc
includelib C:\masm32\lib\irvine32.lib
includelib C:\masm32\lib\kernel32.lib
includelib C:\masm32\lib\user32.lib


;Prev used global vars
KEY = 239
BUFMAX = 128


.data
buffer BYTE BUFMAX+1 DUP(0)
result DWORD ?
buffer2 BYTE BUFMAX+1 DUP(0)
xPrompt BYTE "Please enter the first 8digit hexadecimal:",0
yPrompt BYTE "Please enter the second 8digit hexadecimal ('not' will only function on the first entry):",0
buffer3 BYTE BUFMAX+1 DUP(0)
headerPrompt BYTE "(1=and)(2=or)(3=not)(4=xor)(5=exit)"
buffer4 BYTE BUFMAX+1 DUP(0)
opPrompt BYTE "Please enter a number (1-5) to select an operation:",0
x DWORD ?
y DWORD ?
xi BYTE ?
yi BYTE ?
op BYTE ?






.code
main proc

	call Message1
	call readHex
	mov [x], eax

	call ClearRegs

	call Message2
	call readHex
	mov [y], eax

	call ClearRegs

	call MessageHeader
	call MessageOp
	call readInt
	mov [op], al

	cmp eax, 1d
	je andOp

	cmp eax, 2d
	je orOp

	cmp eax, 3d
	je notOp

	cmp eax, 4d
	je xorOp

	cmp eax, 5d
	je exitOp

	andOp:
		call ClearRegs
		mov eax, [x]
		and eax,[y]
		mov [result], eax
		call DisplayMessage
		call ClearRegs
		jmp C1

	
	orOp:
		call ClearRegs
		mov eax, [x]
		or eax,[y]
		mov [result], eax
		call DisplayMessage
		call ClearRegs
		jmp C1

	notOp:
		call ClearRegs
		mov eax, [x]
		not eax
		mov [result], eax
		call DisplayMessage
		call ClearRegs
		jmp C1

	xorOp:
		call ClearRegs
		mov eax, [x]
		xor eax,[y]
		mov [result], eax
		call DisplayMessage
		call ClearRegs
		jmp C1

	exitOp:
		call ClearRegs
		jmp C1

	C1: 
		call ClearRegs
	
	invoke ExitProcess,0
main endp


ClearRegs proc
mov eax,0
mov ebx,0
ret
ClearRegs endp


Message1 PROC
call Crlf
pushad
mov edx, OFFSET xPrompt
call WriteString
popad
ret
Message1 endp

MessageHeader PROC
call Crlf
pushad
mov edx, OFFSET headerPrompt
call WriteString
popad
ret
MessageHeader endp

Message2 PROC
call Crlf
pushad
mov edx, OFFSET yPrompt
call WriteString
popad
ret
Message2 endp


MessageOp PROC
call Crlf
pushad
mov edx, OFFSET opPrompt
call WriteString
popad
ret
MessageOp endp



;----------------------------------
DisplayMessage proc
;displays the message
; Receives: EDX points to msg
; Returns: nothing
;----------------------------------
pushad
;call WriteString
mov edx, OFFSET [result]
call WriteHex
;call Crlf
call Crlf
popad
ret
DisplayMessage ENDP

end main
