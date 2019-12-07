;Homework 5 "Greatest Common Divisor"
;
;And I thought I'd never use Euclid's Algorithm outside my Abstract Algebra class!



;INCLUDE ALL LIBS
include C:\masm32\include\Irvine32.inc
includelib C:\masm32\lib\irvine32.lib
includelib C:\masm32\lib\kernel32.lib
includelib C:\masm32\lib\user32.lib

KEY = 239
BUFMAX = 128

.data
xPrompt BYTE "Enter the plain text:",0

x DWORD ?
y DWORD ?

n DWORD ?

xPrime DWORD ?
yPrime DWORD ?

buffer BYTE BUFMAX+1 DUP(0)

ans DWORD ?
bufsize DWORD ?

.code
main proc

	;GET X VALUE
	call Message1
	call readHex
	mov [x], eax
	mov [xPrime], eax

	call theCleaners

	;GET Y VALUE
	call Message1
	call readHex
	mov [y], eax
	mov [yPrime], eax

	call theCleaners
	
	;NOW THAT WE HAVE DATA, WE WILL PROCEED WITH EUCLIDS ALGORITHM
	Looper:
		
		;MAIN EQN: 
		;	| n= x'%y'
		mov eax, [xPrime]
		mov ebx, [yPrime]

		;GET REMAINDER FROM EDX, MAIN DIVISION RESULT STORED IN EAX
		div ebx
		mov [n], edx

		call theCleaners


		;MOVING Y => X
		mov eax, [yPrime]
		mov [xPrime], eax
		call theCleaners

		;MOVING N => Y
		mov eax, [n]
		mov [yPrime], eax
		call theCleaners

		;LOOP IF y>0
		cmp [yPrime], 0
		jg Looper


		;ELSE FIN
		jmp Finish

	Finish:
		;TODO: SPIT OUT GCD
		call theCleaners
		mov eax, [xPrime]
		mov [ans], eax
		call theCleaners
		call DisplayMessage
		invoke ExitProcess,0
main endp


Message1 PROC
call Crlf
pushad
mov edx, OFFSET xPrompt
call WriteString
popad
ret
Message1 endp


;----------------------------------
DisplayMessage proc
;displays the message
; Receives: EDX points to msg
; Returns: nothing
;----------------------------------
call theCleaners
pushad
mov eax, [ans]
call WriteHex
call Crlf
popad
ret
DisplayMessage ENDP


theCleaners proc
mov eax,0
mov ebx,0
mov edx,0
ret
theCleaners endp


end main
