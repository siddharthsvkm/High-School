# Siddharth Sivakumar
# December 31, 2023
# The purpose of this program is to create a
# tic-tac-toe game where the user can play
# the computer or another player.

import secrets
# The secrets module is used for generating random numbers - Python 3.6


def print_board(board):
    board_design = ["┌-----------┐", "│ " + str(board[0]) + " │ " + str(board[1]) + " │ " + str(board[2]) + " │",
                    "├---+---+---┤", "│ " + str(board[3]) + " │ " + str(board[4]) + " │ " + str(board[5]) + " │",
                    "├---+---+---┤", "│ " + str(board[6]) + " │ " + str(board[7]) + " │ " + str(board[8]) + " │",
                    "└-----------┘"]
    for element in board_design:
        print(element)


def find_opponent(board):
    opponent = input("Would you like to play the computer or another player(Computer/Player)?")
    if opponent.lower() == "computer":
        gameplay(board, 1)
    elif opponent.lower() == "player":
        gameplay(board, 2)
    else:
        print("Please try again.")
        find_opponent(board)


def gameplay(board, opponent_num):
    open_spots = [0, 1, 2,
                  3, 4, 5,
                  6, 7, 8]
    if opponent_num == 1:
        player1 = "you"
        player2 = "the computer"
        player1_prompt = "It's your turn, which position to move to(1-9)?"
    else:
        player1 = "player 1"
        player2 = "player 2"
        player1_prompt = "It's the first player's turn, which position to move to(1-9)?"
    print_board(board)
    for x in range(9):
        if x % 2 == 0:
            move = int(input(player1_prompt)) - 1
            while move not in open_spots:
                print("That is not a valid answer. Please type a number 1-9.")
                move = int(input(player1_prompt)) - 1
            board[move] = "X"
        else:
            if opponent_num == 1:
                move = secrets.choice(open_spots)
                print("The computer moved to position " + str(move + 1) + ".")
                board[move] = "O"
            else:
                move = int(input("It's the second player's turn, which position to move to(1-9)?")) - 1
                while move not in open_spots:
                    print("That is not a valid answer. Please type a number 1-9.")
                    move = int(input("It's the second player's turn, which position to move to(1-9)?")) - 1
                    print(move)
                board[move] = "O"

        open_spots.remove(move)
        if check_winner(board, player1, player2, x):
            break
        if opponent_num == 2 or (x % 2 == 1 and opponent_num == 1):
            print_board(board)


def declare_winner(winner, loser):
    print("Congratulations to " + winner + ", " + winner + " beat " + loser + "!")


def check_winner(board, player_1, player_2, move_count):
    players = ["X", "O"]
    player_names = [player_1, player_2]
    winner_index = -1
    for f in range(3):
        horizontal_value = board[3 * f]
        same = True
        for s in range(3):
            if board[3*f+s] != horizontal_value:
                same = False
        if same:
            winner_index = players.index(horizontal_value)

        vertical_value = board[f]
        same = True
        for s in range(3):
            if board[3 * s + f] != vertical_value:
                same = False
        if same:
            winner_index = players.index(vertical_value)

    forward_diagonal_value = board[0]
    same = True
    for s in range(0, 3):
        if board[3 * s + s] != forward_diagonal_value:
            same = False
    if same:
        winner_index = players.index(forward_diagonal_value)

    backward_diagonal_value = board[2]
    same = True
    for s in range(0, 3):
        if board[3 * s + (2 - s)] != backward_diagonal_value:
            same = False
    if same:
        winner_index = players.index(backward_diagonal_value)
    if winner_index == -1:
        if move_count == 8:
            print_board(board)
            print("Draw! There is no winner.")
            return True
        return False
    loser_index = 1 - winner_index
    print_board(board)
    declare_winner(player_names[winner_index], player_names[loser_index])
    return True


def play():
    while True:
        board = [1, 2, 3,
                 4, 5, 6,
                 7, 8, 9]
        find_opponent(board)
        play_again = input("Do you want to play again(Yes/No)?")
        while play_again.lower() != "no" and play_again.lower() != "yes":
            play_again = input("Do you want to play again(Yes/No)?")
        if play_again.lower() == "no":
            break
    print("\nThank you for playing! Have a nice day!")


print("Tic-Tac-Toe –")
print("This game is for two players who take turns marking the spaces in a three-by-three\n"
      "grid with X or O. The player who succeeds in placing three of their marks in a\nhorizontal, "
      "vertical, or diagonal row is the winner. The game is a draw if, after\nall squares have been "
      "occupied, neither player completely occupies a winning line.\n")
play()
